package com.xiao.product.service;

import com.xiao.product.dataobject.ProductCategory;

import java.util.List;

/**
 * @author XYW
 * @create 2020-05-09 14:25
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
