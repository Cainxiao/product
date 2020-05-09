package com.xiao.product.VO;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author XYW
 * @create 2020-05-09 14:36
 */
@Data
public class ProductInfoVo {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JacksonInject("price")
    private BigDecimal productPrice;

    @JacksonInject("description")
    private String productDescription;

    @JacksonInject("icon")
    private String productIcon;
}