package com.yochi.springbootmall.dao;

import com.yochi.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
