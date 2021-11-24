package com.gavin.service;

import com.gavin.controller.UserController;
import com.gavin.pojo.Book;
import com.gavin.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImp implements UserService{

    @Resource(name = "book")
    private Book book;
    @Resource(name = "book")
    public void setBook(Book book) {
        this.book = book;
    }
    @Resource(name = "user")
    private User user;
    @Resource(name = "user")
    public void setUser(User user) {
        this.user = user;
    }
    @Resource(name="userController")
    private UserController userController;
    @Resource(name="userController")
    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    @Override
    public void lendBook() {
        System.out.println("借阅者信息--\n"+this.user + "\n借的书信息为--\n" + this.book);
       userController.lendInfo();

    }
}
