package com.example.phase3week1.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class Found {
    @PostMapping("/edit.jsp")
    public String loadEdit(){
        return "edit";
    }
}
