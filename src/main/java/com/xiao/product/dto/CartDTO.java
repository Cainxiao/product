package com.xiao.product.dto;

import lombok.Data;

/**
 * @author XYW
 * @create 2020-05-13 10:56
 */
@Data
public class CartDTO {

    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;
}
