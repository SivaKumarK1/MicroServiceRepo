package com.user.service;

import com.user.entity.User;
import com.user.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
@Autowired
        private UserRepo userRepo;
    //fake user list
//
//    List<User> list = List.of(
//            new User(1311L, "Anil Kumar", "23525625"),
//            new User(1312L, "Ankit Tiwari", "99999"),
//            new User(1314L, "Ravi Tiwari", "888")
//    );

//    @Override
//    public User getUser(Long id) {
//        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
//    }

    @Override
    public User getUser(Long id) {
        Optional<User>  user = userRepo.findById(id);
        if(!user.isPresent()){
            System.out.println("Not Available");
        }
        return  user.get();
    }

    @Override
    public void saveUserData(User user) {
        userRepo.save(user);
    }
}
