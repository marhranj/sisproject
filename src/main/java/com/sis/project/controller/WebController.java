package com.sis.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String indexPage(Model model)
    {
        return "home";
    }

    @GetMapping("/hello")
    public String helloPage(Model model)
    {
        return "hello";
    }

    @GetMapping("/login")
    public String loginPage(Model model)
    {
        return "login";
    }

    @GetMapping("/403")
    public String forbiddenPage(Model model)
    {
        return "403";
    }

}
