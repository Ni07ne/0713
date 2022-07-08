package com.nine.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nine.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: nine
 * @version: 1.0
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
