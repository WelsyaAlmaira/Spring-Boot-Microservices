package com.techie.microservices.order.dto;

import java.math.BigDecimal;

public record OrderRequest(Long id, String orderNumber, String skuCode, BigDecimal price, Integer quantity) {
    // private String orderNumber;
    // private String skuCode;
    // private BigDecimal price;
    // private Integer quantity;
}
