/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hand.maven.zs.service;

import com.hand.maven.zs.dao.user.IUserDao;
import com.hand.maven.zs.model.user.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ZS
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public UserEntity findUserById(Integer id) {
        UserEntity entity = userDao.findUserEntityById(id);
        return entity;
    }

}
