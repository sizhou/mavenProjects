/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hand.maven.zs.controller;

import com.hand.maven.zs.model.user.UserEntity;
import com.hand.maven.zs.service.IUserService;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ZS
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService UserServiceImpl;

    /**
     * findUserByUserId
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/findUserById", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    @ResponseBody
    public String findUserById( Integer id) {
        UserEntity userEntity = UserServiceImpl.findUserById(id);
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationConfig.Feature.INDENT_OUTPUT, Boolean.TRUE);
        try {
            String json = mapper.writeValueAsString(userEntity);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
