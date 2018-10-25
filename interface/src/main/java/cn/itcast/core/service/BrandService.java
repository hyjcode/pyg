package cn.itcast.core.service;

import cn.itcast.core.pojo.good.Brand;

import java.util.List;

public interface BrandService {
    /**
     * 品牌列表
     * @return
     */
    List<Brand> findAll();
    /**
     * 品牌列表
     */
}
