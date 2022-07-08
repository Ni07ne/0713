package com.nine.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nine.entity.DishFlavor;
import com.nine.mapper.DishFlavorMapper;
import com.nine.service.DishFlavorService;
import org.springframework.stereotype.Service;

/**
 * @author: nine
 * @version: 1.0
 */
@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
