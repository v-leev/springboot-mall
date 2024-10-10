package com.vleev.springbootmall.service;

import com.vleev.springbootmall.dto.ProductRequest;
import com.vleev.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
