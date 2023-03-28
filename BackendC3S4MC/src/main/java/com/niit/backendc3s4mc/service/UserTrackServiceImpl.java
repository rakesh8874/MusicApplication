package com.niit.backendc3s4mc.service;

import com.niit.backendc3s4mc.domain.User;
import com.niit.backendc3s4mc.repository.UserTrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTrackServiceImpl implements UserTrackService{

    UserTrackRepository userTrackRepository;

    @Autowired
    public UserTrackServiceImpl(UserTrackRepository userTrackRepository) {
        this.userTrackRepository = userTrackRepository;
    }

    @Override
    public User registerUserAndTrack(User user) {
        if(userTrackRepository.findById(user.getUserId()).isPresent()){
            return null;
        }else{
          return userTrackRepository.save(user);
        }
    }

    @Override
    public List<User> getAllUserAndTrack() {
        return userTrackRepository.findAll();
    }

    @Override
    public boolean deleteUserTrack(String id) {
        if(userTrackRepository.findById(id).isPresent()){
            userTrackRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public User updateUserTrack(User user, String userId) {
        if(userTrackRepository.findById(userId).isPresent()){
            User tempUser = userTrackRepository.findById(userId).get();
            tempUser.setUserId(user.getUserId());
            tempUser.setUserPassword(user.getUserPassword());
            tempUser.setUserName(user.getUserName());
            tempUser.setUserPhone(user.getUserPhone());
           return tempUser;
        }
        return null;
    }
}
