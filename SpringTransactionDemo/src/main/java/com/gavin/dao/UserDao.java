package com.gavin.dao;

public interface UserDao {
    void lendBook();
    void listAllBook();
    void findBook(String BookName);
    void transferBookCount(Integer countOut,Integer countIn ,Integer Count);
}
