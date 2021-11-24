package com.gavin.service;

public interface UserService {
    void lendBook();
    void examineBook();
    void findBookByName(String BookName);
    void transferCount(Integer countOut,Integer countIn ,Integer Count);
}
