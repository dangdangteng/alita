package com.angle.alita.mimor.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webcontroller")
public class WebController {
    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
