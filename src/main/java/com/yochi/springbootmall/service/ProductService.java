package com.yochi.springbootmall.service;

import com.yochi.springbootmall.dto.ProductRequest;
import com.yochi.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
