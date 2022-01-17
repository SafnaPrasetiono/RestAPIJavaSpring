package com.restapi.services;

import com.restapi.entity.Users;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity insert(Users users);
    ResponseEntity show();
    ResponseEntity update(Integer id,Users users);
    ResponseEntity delete(Integer id);
}
