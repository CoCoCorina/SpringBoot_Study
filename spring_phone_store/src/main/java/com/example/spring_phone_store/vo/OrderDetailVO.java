package com.example.spring_phone_store.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderDetailVO {
    private String orderId;
    private String buyerName;
    @JsonProperty("tal")
    private String buyerPhone;
    @JsonProperty("address")
    private String buyerAddress;
    @JsonProperty("num")
    private Integer phoneQuantity;
    private String phoneName;
    @JsonProperty("specs")
    private String specsName;
    @JsonProperty("price")
    private String specsPrice;
    @JsonProperty("icon")
    private String phoneIcon;
    @JsonProperty("amount")
    private BigDecimal orderAmount;
    private Integer payStatus;
    private Integer freight = 10;
}
