package com.yochi.springbootmall.service.impl;

import com.yochi.springbootmall.dao.ProductDao;
import com.yochi.springbootmall.model.Product;
import com.yochi.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
