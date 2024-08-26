package com.yochi.springbootmall.service;

import com.yochi.springbootmall.constant.ProductCategory;
import com.yochi.springbootmall.dto.ProductRequest;
import com.yochi.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
