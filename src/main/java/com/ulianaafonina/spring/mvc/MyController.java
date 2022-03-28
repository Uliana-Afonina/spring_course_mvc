package com.ulianaafonina.spring.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }
}
