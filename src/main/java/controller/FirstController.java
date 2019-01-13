package controller;

import dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
@RequestMapping("/first")
@Controller
public class FirstController {
    @Autowired
    private DemoDao demoDao;

    @RequestMapping(value="/sayHello",produces="text/html;charset=UTF-8",method = RequestMethod.GET)
    public @ResponseBody
    String sayHello(){
        return "hello";
    }
    @RequestMapping(value="/testDao",produces="text/html;charset=UTF-8",method = RequestMethod.GET)
    public @ResponseBody String testDao(){
        StringBuilder sb = new StringBuilder();
        List<Map<String,Object>> arr = demoDao.getAddressAll();
        if(arr != null){
            for(Map<String,Object> map : arr){
                sb.append("id :"+map.get("id").toString()).append("\t");
                sb.append("name :"+map.get("name").toString()).append("\t");
                sb.append("gender :"+map.get("gender").toString()).append("\t");
                sb.append("\r\n");
            }
        }else {
            sb.append("no data");
        }
        return sb.toString();
    }
}
