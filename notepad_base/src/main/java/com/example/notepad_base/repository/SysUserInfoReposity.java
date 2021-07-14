package com.example.notepad_base.repository;

import com.example.notepad_base.entity.SystemEntity.SysUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserInfoReposity extends JpaRepository<SysUserInfo,String> {
    public List<SysUserInfo> findAllByUserName(String userName);
}
