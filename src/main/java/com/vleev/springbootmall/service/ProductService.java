package com.vleev.springbootmall.service;

import com.vleev.springbootmall.dto.ProductQueryParams;
import com.vleev.springbootmall.dto.ProductRequest;
import com.vleev.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
