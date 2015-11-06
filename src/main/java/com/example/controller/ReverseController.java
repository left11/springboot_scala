package com.example.controller;

import com.example.service.ScalaStringService;
import com.example.service.JavaStringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinyong on 11/4/15.
 * email: jinyong1112@126.com
 */
@RestController
public class ReverseController {
    @Autowired
    ScalaStringService scalaStringService;

    @Autowired
    JavaStringService javaStringService;

    /**
     * reverse your name
     * @param name the name input
     * @return     revered name
     */
    @RequestMapping(value = "/reverse")
    public String hello(@RequestParam(value = "name", required = false, defaultValue = "gonynij")String name) {
        return scalaStringService.reverse(name) + " " + javaStringService.reverse(name);
    }
}
