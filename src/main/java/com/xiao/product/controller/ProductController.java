package com.xiao.product.controller;

import com.xiao.product.dto.CartDTO;
import com.xiao.product.VO.ProductInfoVo;
import com.xiao.product.VO.ProductVO;
import com.xiao.product.VO.ResultVO;
import com.xiao.product.dataobject.ProductCategory;
import com.xiao.product.dataobject.ProductInfo;
import com.xiao.product.service.CategoryService;
import com.xiao.product.service.ProductService;
import com.xiao.product.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author XYW
 * @create 2020-05-09 9:55
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    //2
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    /**
     * 1.查询所有在架商品
     * 2.获取商品type列表
     * 3.查询数目
     * 4.构造数据
     */
    @GetMapping("/list")
    public ResultVO<ProductVO> list() {
        //查询所有在架商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        //获取商品type列表
        List<Integer> categroyTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());

        //查询数目
        List<ProductCategory> categoryList = categoryService.findByCategoryTypeIn(categroyTypeList);

        //构造数据
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : categoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategroyName(productCategory.getCategoryName());
            productVO.setCategroyType(productCategory.getCategoryType());
            List<ProductInfoVo> productInfoVoList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {

                    ProductInfoVo productInfoVo = new ProductInfoVo();
                    BeanUtils.copyProperties(productInfo, productInfoVo);
                    productInfoVoList.add(productInfoVo);
                }
            }
            productVO.setProductInfoVosList(productInfoVoList);
            productVOList.add(productVO);
        }
        return ResultVOUtil.success(productVOList);
    }

    /**
     * 获取商品列表（给订单服务使用）
     * @param productIdList
     * @return
     */
    @PostMapping("/listForOrder")
    public List<ProductInfo> listForOrder(@RequestBody List<String> productIdList) {
        return productService.findList(productIdList);
    }


    /**
     * 扣库存
     * @param cartDTOList
     */
    @PostMapping("/decreaseStock")
    public void decreaseStock(@RequestBody List<CartDTO> cartDTOList) {
        productService.decreaseStock(cartDTOList);
    }
}
