package com.product.service;
import com.product.entity.ProductDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductDetailsServiceImp implements ProductDetailsService{
    //fake list of product details
    List<ProductDetails> list= new ArrayList<>(List.of(
            new ProductDetails(1L, 5L, 70000L, 111L),
            new ProductDetails(2L, 6L, 70000L, 112L),
            new ProductDetails(3L, 7L, 50000L, 113L)
    ));
    //List<ProductDetails> list=new ArrayList<>();




    @Override
    public List<ProductDetails> getProductDetailsOfProduct(Long productId) {
        return list.stream().filter(productDetails -> productDetails.getProductId().equals(productId)).collect(Collectors.toList());
    }

    @Override
    public ProductDetails addProductDetails(ProductDetails productDetails) {

        list.add(productDetails);
        return productDetails;
    }

    @Override
    public void deleteProductDetails(Long id) {
        list.removeIf(productDetails -> productDetails.getProductId().equals(id));
    }

    @Override
    public List<ProductDetails> getAllProductDetails() {
        return list;
    }
}
