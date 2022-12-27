package com.product.entity;

public class ProductDetails {
    private Long pId;
    private Long size;
    private Long price;
    private Long productId;

    public ProductDetails() {
    }

    public ProductDetails(Long pId, Long size, Long price, Long productId) {
        this.pId = pId;
        this.size = size;
        this.price = price;
        this.productId = productId;
    }

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
