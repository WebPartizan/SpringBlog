package com.kosmocourses.springblogtest.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controler {
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "It is my blog!";
    }
}