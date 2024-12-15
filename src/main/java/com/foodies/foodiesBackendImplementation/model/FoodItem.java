package com.foodies.foodiesBackendImplementation.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "food_items")
public class FoodItem {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private String shopOwnerId;
}