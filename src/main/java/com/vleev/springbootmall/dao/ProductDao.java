package com.vleev.springbootmall.dao;

import com.vleev.springbootmall.dto.ProductRequest;
import com.vleev.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
