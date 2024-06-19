package com.coopfarmer.coopfarmer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @GetMapping("/")
    public String hello() {
        return "Hello worls";
    }
}
