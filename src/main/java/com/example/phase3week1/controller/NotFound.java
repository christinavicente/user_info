package com.example.phase3week1.controller;

import org.springframework.web.bind.annotation.PostMapping;

public class NotFound {


    @PostMapping("/error.jsp")
    public String loadError(){
        return "error";
    }
}
