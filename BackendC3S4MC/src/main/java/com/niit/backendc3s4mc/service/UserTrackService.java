package com.niit.backendc3s4mc.service;

import com.niit.backendc3s4mc.domain.User;

import java.util.List;

public interface UserTrackService {

    User registerUserAndTrack(User user);
    List<User> getAllUserAndTrack();
    boolean deleteUserTrack(String id);
    User updateUserTrack(User user, String userId);
}
