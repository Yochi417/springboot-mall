package com.yochi.springbootmall.service;

import com.yochi.springbootmall.dto.CreateOrderRequest;
import com.yochi.springbootmall.dto.OrderQueryParams;
import com.yochi.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
