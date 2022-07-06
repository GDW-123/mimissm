package com.manongyanjiuseng.service;

import com.manongyanjiuseng.pojo.ProductInfo;
import com.manongyanjiuseng.pojo.vo.ProductVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ProductInfoService {
    //显示全部商品(不分页)
    List<ProductInfo> getAll();

    //分页
    PageInfo splitPage(int page, int pageSize);

    //增加
    int save(ProductInfo info);

    //根据主键查商品
    ProductInfo getById(Integer pid);

    //修改
    int update(ProductInfo info);

    //删除
    int delete(Integer pid);

    //批量删除
    int deleteBatch(String[] pids);

    //多条件分页查询
     List <ProductInfo> selectCondition(ProductVo vo);

    //多条件分页查询
    PageInfo<ProductInfo> splitPageVo(ProductVo vo, int pageSize);
}
