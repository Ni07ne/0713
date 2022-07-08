package com.nine.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nine.entity.OrderDetail;
import com.nine.mapper.OrderDetailMapper;
import com.nine.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}