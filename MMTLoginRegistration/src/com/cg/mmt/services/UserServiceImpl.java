package com.cg.mmt.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.mmt.beans.Login;
import com.cg.mmt.beans.User;
import com.cg.mmt.daoservices.UserDao;


public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public void register(User user) {
     userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}