package com.zuoan.service.impl;

import com.zuoan.mapper.UserInfoMapper;
import com.zuoan.po.UserInfo;
import com.zuoan.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public void add(UserInfo userInfo) {
        userInfoMapper.add(userInfo);
    }

    @Override
    public void delete(Integer id) {
        userInfoMapper.delete(id);
    }

    @Override
    public void update(UserInfo userInfo) {
        userInfoMapper.update(userInfo);
    }

    @Override
    public UserInfo queryById(Integer id) {
        return userInfoMapper.queryById(id);
    }

    @Override
    public List<UserInfo> queryAll() {
        return userInfoMapper.queryAll();
    }
}

