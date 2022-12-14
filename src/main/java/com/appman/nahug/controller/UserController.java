package com.appman.nahug.controller;


import com.appman.nahug.model.CatModel;
import com.appman.nahug.model.UserModel;
import com.appman.nahug.service.CatService;
import com.appman.nahug.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value="/user", method=RequestMethod.POST)
    public UserModel createUser(@RequestBody UserModel userModel) {
        return userService.createUser(userModel);
    }

    //get all user
    @RequestMapping(value="/user", method=RequestMethod.GET)
    public List<UserModel> readUser() {
        return userService.getUser();
    }

    @RequestMapping(value="/user/{id}", method=RequestMethod.PUT)
    public UserModel editUser(@PathVariable(value = "id") String id, @RequestBody UserModel userModel) {
        return userService.updateUser(id, userModel);
    }

    @RequestMapping(value="/user/{id}", method=RequestMethod.DELETE)
    public void deleteCat(@PathVariable(value = "id") String id) {
        userService.deleteUser(id);
    }
}
