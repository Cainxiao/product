package com.xiao.product.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author XYW
 * @create 2020-05-09 11:25
 */
@Data
@Entity
public class ProductCategory {

    /**
     * 不仅是主键还有自增属性
     */
    @Id
    @GeneratedValue
    private Integer categoryId;

    private String categoryName;

    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

}
