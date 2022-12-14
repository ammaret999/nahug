package com.appman.nahug.service;

import com.appman.nahug.model.CatModel;
import com.appman.nahug.model.UserModel;
import com.appman.nahug.repository.CatRepository;
import com.appman.nahug.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    // CREATE
        //creatUser
    public UserModel createUser(UserModel userModel) {
        return userRepository.save(userModel);
    }

    // READ
    public List<UserModel> getUser() {
        return userRepository.findAll();
    }


    // DELETE
    public void deleteUser(String id) {
        userRepository.deleteById(Long.valueOf(id));
    }

    // UPDATE
    public UserModel updateUser(String id, UserModel userModel) {
        UserModel userUpdate = userRepository.findById(Long.valueOf(id)).get();
        userUpdate.setFirst_name(userModel.getFirst_name());
        userUpdate.setLast_name(userModel.getLast_name());
        userUpdate.setPassword(userModel.getPassword());

        return userRepository.save(userUpdate);
    }
}
