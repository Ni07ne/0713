package com.nine.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nine.entity.Employee;
import com.nine.mapper.EmployeeMapper;
import com.nine.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author: nine
 * @version: 1.0
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
