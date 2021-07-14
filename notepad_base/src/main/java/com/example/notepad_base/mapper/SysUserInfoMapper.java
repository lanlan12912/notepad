package com.example.notepad_base.mapper;

import com.example.notepad_base.entity.SystemEntity.SysUserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserInfoMapper {
    public List<SysUserInfo> findAllByUserName(@Param(value = "userName") String userName);
}
