package com.example.phase3week1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/usersearch")
public class UserController {

    public void findUsers(@RequestParam(name="ID")String id){

        if (validate(id)){

        }else{

        }
    }


    private boolean validate(String id){
        return false;
    }

}
