package com.example.notepad_base.controller;

import com.example.notepad_base.entity.SystemEntity.SysUserInfo;
import com.example.notepad_base.mapper.SysUserInfoMapper;
import com.example.notepad_base.repository.SysUserInfoReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private SysUserInfoReposity userInfoReposity;

    @Autowired
    private SysUserInfoMapper userInfoMapper;
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public List<SysUserInfo> hello(){
        List<SysUserInfo> userInfos  = userInfoMapper.findAllByUserName("lanlan");
        return userInfos;
//        return userInfoMapper.findAllByUserName("lanlan");
//        return userInfoReposity.findAllByUserName("lanlan");
    }
}
