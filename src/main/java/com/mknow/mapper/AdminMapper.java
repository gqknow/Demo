package com.mknow.mapper;

import com.mknow.pojo.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);
    //增加后台成员
    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    //修改成员登录账号状态（0有效，1暂时无效，2无效）
    int updateFlag(@Param("flag") int flag, @Param("id") int id);
}