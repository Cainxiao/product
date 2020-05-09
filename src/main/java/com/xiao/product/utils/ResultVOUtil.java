package com.xiao.product.utils;

import com.xiao.product.VO.ResultVO;

/**
 * @author XYW
 * @create 2020-05-09 15:26
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
