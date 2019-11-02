package com.atguigu.gmall.controller;

import com.atguigu.gmall.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping(value = "getString",method = RequestMethod.GET)
    @ResponseBody
    public String getString(String str){
        String resultstr = indexService.getString(str);
        return resultstr;
    }
}
