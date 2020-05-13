package com.xiao.product.exception;

import com.xiao.product.enums.ResultEnum;

/**
 * @author XYW
 * @create 2020-05-13 11:09
 */
public class ProductException extends RuntimeException{

    private Integer code;

    public ProductException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
