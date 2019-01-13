package model;

import java.io.File;

public class test {
    public static void main(String[] args) {
        File file = new File(".resources"+File.separator+"spring-mvc.xml");
        System.out.println(file.exists());
    }
}
