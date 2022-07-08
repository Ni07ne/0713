package com.nine.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nine.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: nine
 * @version: 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
