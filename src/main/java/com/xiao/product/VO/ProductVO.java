package com.xiao.product.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author XYW
 * @create 2020-05-09 14:31
 */
@Data
public class ProductVO {

    /**
     * 返回给前端的名称为name
     */
    @JsonProperty("name")
    private String categroyName;

    @JsonProperty("type")
    private Integer categroyType;

    @JsonProperty("foods")
    List<ProductInfoVo> productInfoVosList;
}
