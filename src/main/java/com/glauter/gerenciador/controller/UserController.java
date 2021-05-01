package com.glauter.gerenciador.controller;

import com.glauter.gerenciador.model.UserModel;
import com.glauter.gerenciador.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    public UserModel setUser() {
        UserModel user = new UserModel();
        user.setAge(25);
        user.setEmail("test1@gmail.com");
        user.setName("test1_name");

        return userRepository.save(user);
    }

}
