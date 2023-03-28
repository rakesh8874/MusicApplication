package com.niit.backendc3s4mc.controller;

import com.niit.backendc3s4mc.domain.User;
import com.niit.backendc3s4mc.service.UserTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class UserTrackController {

    UserTrackService userTrackService;

    @Autowired
    public UserTrackController(UserTrackService userTrackService) {
        this.userTrackService = userTrackService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> addUserTrack(@RequestBody User user){
        return new ResponseEntity<>(userTrackService.registerUserAndTrack(user), HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public ResponseEntity<?> getAllUserTrack(){
        return new ResponseEntity<>(userTrackService.getAllUserAndTrack(),HttpStatus.FOUND);
    }
    @DeleteMapping("/user/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable String userId){
        return new ResponseEntity<>(userTrackService.deleteUserTrack(userId),HttpStatus.OK);
    }
    @PutMapping("/user/{userId}")
    public ResponseEntity<?> updateUser(@RequestBody User user, @PathVariable String userId){
        return new ResponseEntity<>(userTrackService.updateUserTrack(user,userId),HttpStatus.CREATED);
    }
}
