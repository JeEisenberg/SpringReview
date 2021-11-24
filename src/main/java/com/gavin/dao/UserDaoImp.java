package com.gavin.dao;

import com.gavin.pojo.Book;
import com.gavin.pojo.User;
import org.springframework.stereotype.Repository;

//@Repository("userDao")
public class UserDaoImp implements UserDao{
private Book book;

    public void setBook(Book book) {
        this.book = book;
    }
private User user;

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void lendBook() {

        System.out.println(this.user+"借的书信息为--"+this.book);
    }


}
