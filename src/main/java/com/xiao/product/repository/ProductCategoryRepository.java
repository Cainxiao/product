package com.xiao.product.repository;

import com.xiao.product.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author XYW
 * @create 2020-05-09 11:30
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, String> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
