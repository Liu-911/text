package edu.czjt.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.czjt.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
} 