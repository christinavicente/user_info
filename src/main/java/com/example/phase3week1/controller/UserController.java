package com.example.phase3week1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {

    private String endlocation;


    @GetMapping("/usersearch")
    public void findUsers(@RequestParam(name="ID")String id){
    }

    @PostMapping("/{endlocation}")
    public void foundUsers(){

    }

    private void validate(String id){
        if(id.equals("ID")){
            endlocation="edit";
        }else {
            endlocation="error";
        }
    }

}
