package com.nine.dto;

import com.nine.entity.Setmeal;
import com.nine.entity.SetmealDish;
import lombok.Data;

import java.util.List;

/**
 * @author: nine
 * @version: 1.0
 */
@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;//套餐关联的菜品集合

    private String categoryName;//分类名称
}
