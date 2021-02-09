package com.example.phase3week1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user_info")
public class EditController {

    @GetMapping("usersearch/")
    public void editUser(@RequestParam("username") String username,
                         @RequestParam("id") String id){

    }




}
