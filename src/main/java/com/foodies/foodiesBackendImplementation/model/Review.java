package com.foodies.foodiesBackendImplementation.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "reviews")
public class Review {
    @Id
    private String id;
    private String userId; 
    private String shopOwnerId; 
    private String foodItemId; 
    private String reviewText;
    private int rating; 
    private String response; 
}