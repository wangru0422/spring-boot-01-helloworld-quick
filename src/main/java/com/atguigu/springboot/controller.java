package com.atguigu.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.Arrays;

@RestController
public class controller {
    @RequestMapping("/hello")
    public String hello(){
        String path1 = "D:\\工具-安装包\\地图下载";
        String path2 = "D:" + File.separator + "工具-安装包" + File.separator + "地图下载";
        System.out.println(path2);
        char[] path3 = path2.toCharArray();
//        System.out.println(path3);
        Arrays.fill(path3,'a');
        System.out.println(path3);
       return "hello world quick!";



    }
}
