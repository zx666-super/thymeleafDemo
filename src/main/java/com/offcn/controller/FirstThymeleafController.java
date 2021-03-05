package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class FirstThymeleafController {
    @GetMapping("/indexPage")
    public String indexPage(Model model) {
        model.addAttribute("message", "Hello, Thymeleaf!");
        Map<String,Object> map=new HashMap();
        map.put("src1","2.jpg");
        model.addAttribute("src",map);
        System.out.println("进入了控制层");
        return "index";
    }
}
