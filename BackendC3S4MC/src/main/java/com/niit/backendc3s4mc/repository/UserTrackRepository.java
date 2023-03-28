package com.niit.backendc3s4mc.repository;

import com.niit.backendc3s4mc.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTrackRepository extends MongoRepository<User, String> {
}
