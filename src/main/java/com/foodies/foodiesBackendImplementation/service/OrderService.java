package com.foodies.foodiesBackendImplementation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodies.foodiesBackendImplementation.model.Order;
import com.foodies.foodiesBackendImplementation.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Create a new Order
    public Order placeOrder(Order order) {
        if (order.getOrderStatus() == null) {
            order.setOrderStatus("Pending");
        }
        return orderRepository.save(order);
    }

    // Get all Orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Get Order by ID
    public Optional<Order> getOrderById(String orderId) {
        return orderRepository.findById(orderId);
    }

    // Update Order by ID
    public Order updateOrder(String orderId, Order orderDetails) {
        Optional<Order> existingOrder = orderRepository.findById(orderId);

        if (existingOrder.isPresent()) {
            Order updatedOrder = existingOrder.get();

            updatedOrder.setUserId(orderDetails.getUserId());
            updatedOrder.setShopOwnerId(orderDetails.getShopOwnerId());
            updatedOrder.setFoodItemIds(orderDetails.getFoodItemIds());
            updatedOrder.setTotalPrice(orderDetails.getTotalPrice());
            updatedOrder.setQuantity(orderDetails.getQuantity());
            updatedOrder.setOrderStatus(orderDetails.getOrderStatus());
            updatedOrder.setDeliveryAddress(orderDetails.getDeliveryAddress());
            updatedOrder.setContactNumber(orderDetails.getContactNumber());

            return orderRepository.save(updatedOrder);
        } else {
            return null;
        }
    }

    // Delete Order by ID
    public boolean deleteOrder(String orderId) {
        Optional<Order> existingOrder = orderRepository.findById(orderId);

        if (existingOrder.isPresent()) {
            orderRepository.delete(existingOrder.get());
            return true;
        }
        return false;
    }
}