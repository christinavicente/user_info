package com.example.phase3week1.controller;


import com.example.phase3week1.model.User;
import com.example.phase3week1.model.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    UserDAO userDAO;
    @Autowired
    Found found;
    @Autowired
    NotFound notFound;
    @Autowired
    EditData editData;
    @Autowired
    User user;
    String id;
    boolean looking;


    private String endlocation;


    @GetMapping("/usersearch")
    public void findUsers(@RequestParam(name="ID")String id){
        looking=true;
        this.id=id;
    }

    @GetMapping("/edit")
    public void editUsers(@RequestParam(name="ID")String id,
                          @RequestParam(name="name")String name){
        looking=false;
        user.setId(id);
        user.setName(name);
        userDAO.saveUser(user);
    }

    @PostMapping("/")
    public void foundUsers(){
        if(looking) {
            if (userDAO.validate(id)) {
                user = userDAO.updateUser();
                found.loadEdit();
            } else {
                notFound.loadError();
            }
        }else {
            editData.saveUser();
        }

    }



}
