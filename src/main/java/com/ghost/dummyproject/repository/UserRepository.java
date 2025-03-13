package com.ghost.dummyproject.repository;

import com.ghost.dummyproject.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByNames(String name);    //so I can literally use the function name to write the query, ex: mongo
}
