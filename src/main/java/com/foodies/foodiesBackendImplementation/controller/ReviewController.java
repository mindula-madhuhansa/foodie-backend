package com.foodies.foodiesBackendImplementation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.foodies.foodiesBackendImplementation.model.Review;
import com.foodies.foodiesBackendImplementation.service.ReviewService;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    // Get all reviews by Admin
    @GetMapping
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    // Get reviews for a shop
    @GetMapping("/shop-owner/{shopOwnerId}")
    public List<Review> getReviewsByShopOwner(@PathVariable String shopOwnerId) {
        return reviewService.getReviewsByShopOwner(shopOwnerId);
    }

    // Get reviews User
    @GetMapping("/food-item/{foodItemId}")
    public List<Review> getReviewsByFoodItem(@PathVariable String foodItemId) {
        return reviewService.getReviewsByFoodItem(foodItemId);
    }

    // Get reviews by user
    @GetMapping("/user/{userId}")
    public List<Review> getReviewsByUser(@PathVariable String userId) {
        return reviewService.getReviewsByUser(userId);
    }

    // Add a review User
    @PostMapping
    public Review addReview(@RequestBody Review review) {
        return reviewService.addReview(review);
    }

    // Respond to a review Shop Owner
    @PutMapping("/{id}/response")
    public Review respondToReview(@PathVariable String id, @RequestParam String response) {
        return reviewService.respondToReview(id, response);
    }

    // Delete a review by Admin
    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable String id) {
        reviewService.deleteReview(id);
    }
}