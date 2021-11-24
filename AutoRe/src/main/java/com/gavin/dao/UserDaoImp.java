package com.gavin.dao;

import com.gavin.pojo.Book;
import com.gavin.pojo.User;
import com.gavin.service.UserService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Repository("userDao")
public class UserDaoImp implements UserDao {
    @Resource(name="userService")
   private UserService userService;
    @Resource(name="userService")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void lendBook() {
        System.out.println("欢迎借阅");
        userService.lendBook();
    }


}
