package com.shxq.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @RequestMapping("/test")
    public Map<String,String> testInerceptor(@RequestBody Map<String,String> params){
        return params;
    }
}
