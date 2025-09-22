package org.example.repository;

import org.example.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    public User findByUserName(String userName);
    public List<User> findByName(String name);

}
