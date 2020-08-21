package com.zq.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ProjectName: community
 * @ClassName: HelloController
 * @Author: 余
 * @Date: 2020/3/10 18:02
 * @Description: 一句话描述该类的功能
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model){
        System.out.println();
        model.addAttribute("name",name);
        return "hello";
    }
}
