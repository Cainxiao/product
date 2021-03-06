package com.xiao.product.enums;

import lombok.Getter;

/**
 * 商品上下架状态
 * @author XYW
 * @create 2020-05-09 14:16
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架"),
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
