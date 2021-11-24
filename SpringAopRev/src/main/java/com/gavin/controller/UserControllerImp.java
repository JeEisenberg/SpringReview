package com.gavin.controller;

import com.gavin.pojo.Book;
import com.gavin.pojo.User;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userController")
public class UserControllerImp  implements UserController{

    @Override
    public void lendInfo() {

        System.out.println("借阅成功");
    }
}
