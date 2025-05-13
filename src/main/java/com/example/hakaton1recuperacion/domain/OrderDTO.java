package com.example.hakaton1recuperacion.domain;

import java.util.List;

public class OrderDTO {
    private Long orderId;
    private String email;
    private List<String> products;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getProducts() {
        return products;
    }
    public void setProducts(List<String> products) {
        this.products = products;
    }
}