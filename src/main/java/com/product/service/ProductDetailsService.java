package com.product.service;

import com.product.entity.ProductDetails;

import java.util.List;

public interface ProductDetailsService {
    public List<ProductDetails> getProductDetailsOfProduct(Long productId);

    public ProductDetails addProductDetails(ProductDetails productDetails);

    void deleteProductDetails(Long id);

    List<ProductDetails> getAllProductDetails();
}
