package com.bitter.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bitter.common.pojo.Resource;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<Resource> {
    void insertResource(int id, String name, String url);
}
