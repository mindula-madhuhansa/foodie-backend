package com.foodies.foodiesBackendImplementation.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="users")
public class User {
    @Id
    @GeneratedValue
    private String id;
    private String username;
    private String password;
    private String role;

    
    
}
