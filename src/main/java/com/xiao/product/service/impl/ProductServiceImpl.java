package com.xiao.product.service.impl;

import com.xiao.product.dataobject.ProductInfo;
import com.xiao.product.enums.ProductStatusEnum;
import com.xiao.product.repository.ProductInfoRepository;
import com.xiao.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XYW
 * @create 2020-05-09 14:13
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
