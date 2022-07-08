package com.nine.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nine.entity.Category;

/**
 * @author: nine
 * @version: 1.0
 */
public interface CategoryService extends IService<Category> {
    //根据ID删除分类
    public void remove(Long id);
}
