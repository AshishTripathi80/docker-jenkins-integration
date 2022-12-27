package com.product.controller;
import com.product.entity.ProductDetails;
import com.product.service.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productDetails")
public class ProductDetailsController {

    @Autowired
    private ProductDetailsService productDetailsService;

    @RequestMapping("/allProduct")
    public List<ProductDetails> getAllProductDetails(){
        return this.productDetailsService.getAllProductDetails();
    }

    @RequestMapping("/product/{productId}")
    public List<ProductDetails> getProductDetails(@PathVariable ("productId") Long productId){
        return this.productDetailsService.getProductDetailsOfProduct(productId);
    }

    @PostMapping("/addProductDetails")
    public ProductDetails addProductDetails(@RequestBody ProductDetails productDetails){

        return this.productDetailsService.addProductDetails(productDetails);
    }

    @PostMapping("/delete/{id}")
    public List<ProductDetails> deleteProductDetails(@PathVariable Long id){
        this.productDetailsService.deleteProductDetails(id);
        return this.productDetailsService.getAllProductDetails();

    }
}
