package com.lz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zheng.liu@baifendian on 2016-04-01.
 */
@Controller
@RequestMapping("/")
public class Index {

    @RequestMapping("/index.do")
    @ResponseBody
    public String testInd(){
        return "{\"name\":\"123\"}";
    }
}
