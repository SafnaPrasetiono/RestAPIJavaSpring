package com.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.entity.Users;
import com.restapi.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    
    @PostMapping("/insert")
    public ResponseEntity insert(@RequestBody Users users){
        return userService.insert(users);
    }

    @GetMapping("")
    public ResponseEntity show(){
        return userService.show();
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity update(@PathVariable("id") Integer id, @RequestBody Users users){
        return userService.update(id, users);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") Integer id){
        return userService.delete(id);
    }
}
