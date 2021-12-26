package com.imooc.mall.services;

import com.imooc.mall.model.pojo.Product;
import com.imooc.mall.model.request.AddProductReq;

import java.util.List;

/**
 * 描述：商品Service
 */
public interface ProductService {

    void add(AddProductReq addProductReq);

    void update(Product updateProduct);

    void delete(Integer id);
}
