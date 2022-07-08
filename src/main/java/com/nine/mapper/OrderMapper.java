package com.nine.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nine.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

}