/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hand.maven.zs.service;

import com.hand.maven.zs.model.user.UserEntity;

/**
 *
 * @author ZS
 */
public interface IUserService {
    UserEntity findUserById (Integer id);
}
