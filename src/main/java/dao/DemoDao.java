package dao;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class DemoDao {
    private JdbcTemplate jdbcTemplate;

    //测试获取address信息
    public List<Map<String,Object>> getAddressAll(){
        String sql = "select * from pets";
        try{
            return jdbcTemplate.queryForList(sql);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
