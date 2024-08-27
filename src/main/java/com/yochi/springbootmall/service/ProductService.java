package com.yochi.springbootmall.service;


import com.yochi.springbootmall.dto.ProductQueryParams;
import com.yochi.springbootmall.dto.ProductRequest;
import com.yochi.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
