package com.restapi.services.impl;

import java.util.List;
import com.restapi.services.UserService;
import com.restapi.repository.UserRepository;
import com.restapi.entity.Users;
import com.restapi.model.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    
    Response response = new Response();
    
    @Override
    public ResponseEntity insert(Users users){
        try {
            Users saved = userRepository.save(users);
            this.response.setCode(200);
            this.response.setData(saved);
            this.response.setMassage("Success");
            return ResponseEntity.ok().body(this.response);
        } catch (Exception e) {
            //TODO: handle exception
            this.response.setCode(500);
			this.response.setData(null);
			this.response.setMassage(e.getMessage());
			return ResponseEntity.internalServerError().body(this.response);
        }
    };

    @Override
    public ResponseEntity show(){
        try {
            List<Users> data = userRepository.findAll();
            this.response.setCode(200);
            this.response.setData(data);
            this.response.setMassage("Success");
            return ResponseEntity.ok().body(this.response);
        } catch (Exception e) {
            //TODO: handle exception
            this.response.setCode(500);
			this.response.setData(null);
			this.response.setMassage(e.getMessage());
			return ResponseEntity.internalServerError().body(this.response);
        }
    };

    @Override
    public ResponseEntity update(Integer id, Users users){
        try {
            Users GetDataId = userRepository.findById(id).get();
            GetDataId.setUsername(users.getUsername());
            GetDataId.setTelepon(users.getTelepon());
            GetDataId.setLahir(users.getLahir());
            Users update = userRepository.save(GetDataId);
            this.response.setCode(200);
            this.response.setData(update);
            this.response.setMassage("Success");
            return ResponseEntity.ok().body(this.response);
        } catch (Exception e) {
            //TODO: handle exception
            this.response.setCode(500);
			this.response.setData(null);
			this.response.setMassage(e.getMessage());
			return ResponseEntity.internalServerError().body(this.response);
        }
    };
    
    @Override
    public ResponseEntity delete(Integer id){
        try {
            userRepository.deleteById(id);
            this.response.setCode(200);
			this.response.setData(null);
			this.response.setMassage("Success!");
			return ResponseEntity.ok().body(this.response);
        } catch (Exception e) {
            //TODO: handle exception
            this.response.setCode(500);
			this.response.setData(null);
			this.response.setMassage(e.getMessage());
			return ResponseEntity.internalServerError().body(this.response);
        }
    };
}
