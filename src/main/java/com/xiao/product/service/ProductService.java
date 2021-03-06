package com.xiao.product.service;

import com.xiao.product.dto.CartDTO;
import com.xiao.product.dataobject.ProductInfo;

import java.util.List;

/**
 * @author XYW
 * @create 2020-05-09 14:09
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    List<ProductInfo> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param cartDTOList
     */
    void decreaseStock(List<CartDTO> cartDTOList);
}
