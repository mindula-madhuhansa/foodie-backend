package com.foodies.foodiesBackendImplementation.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.foodies.foodiesBackendImplementation.model.FoodItem;
import com.foodies.foodiesBackendImplementation.service.FoodItemService;

@RestController
@RequestMapping("/api/food-items")
public class FoodItemController {
    @Autowired
    private FoodItemService foodItemService;

    // Get all food items by user
    @GetMapping
    public List<FoodItem> getAllFoodItems() {
        return foodItemService.getAllFoodItems();
    }

    // Get food items by shop owner
    @GetMapping("/shop-owner/{shopOwnerId}")
    public List<FoodItem> getFoodItemsByShopOwner(@PathVariable String shopOwnerId) {
        return foodItemService.getFoodItemsByShopOwner(shopOwnerId);
    }

    // Add a food item by shop owner
    @PostMapping
    public FoodItem addFoodItem(@RequestBody FoodItem foodItem) {
        return foodItemService.addFoodItem(foodItem);
    }

    // Update a food item by shop owner
    @PutMapping("/{id}")
    public FoodItem updateFoodItem(@PathVariable String id, @RequestBody FoodItem updatedFoodItem) {
        return foodItemService.updateFoodItem(id, updatedFoodItem);
    }

    
    }
}