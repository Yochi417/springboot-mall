package com.yochi.springbootmall.service;

import com.yochi.springbootmall.dto.CreateOrderRequest;
import com.yochi.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
