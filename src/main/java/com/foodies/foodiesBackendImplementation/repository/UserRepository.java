package com.foodies.foodiesBackendImplementation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.foodies.foodiesBackendImplementation.model.User;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);
}
