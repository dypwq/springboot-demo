package com.jk.springbootdemo.controller;


import com.jk.springbootdemo.service.TestService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class TestController {

    @Autowired
    private TestService testService;


    @RequestMapping("/index")
    public String testindex(){
        System.out.println("222");
        return "index";
    }

    @RequestMapping("queryll")
    @ResponseBody
    public  String queryll(){
        List list=testService.queryll();
        return  "";
    }
    @RequestMapping("queryll")
    @ResponseBody
    public  String querylls(){
        List list=testService.queryll();
        return  "";
    }
    }
