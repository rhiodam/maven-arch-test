package com.oda.springmvcjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by saurabh on 2/11/17.
 */

@Controller
public class IndexController {
    @GetMapping("/hello")
    public String index(Model m) {
        m.addAttribute("someAttribute", "someValue");
        return "index";
    }
}
