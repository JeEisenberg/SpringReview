package com.gavin.service;

import com.gavin.controller.UserController;
import com.gavin.pojo.Book;
import com.gavin.pojo.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
@Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void lendBook() {
        System.out.println("借阅者信息--\n"+this.user + "\n借的书信息为--\n" + this.book);
       userController.lendInfo();

    }

    @Override
    public void examineBook() {
        String sql= "select * from bookstore ;";
        RowMapper<Book> rowMapper= new BeanPropertyRowMapper(Book.class);
        List<Book> books = jdbcTemplate.query(sql,rowMapper);
        for (Book b :
                books) {
            System.out.println(b);
        }
    }
    @Override
    public void findBookByName(String BookName){
        String sql= "select * from bookstore  where BookName = ? ;";
        RowMapper<Book>rowMapper = new BeanPropertyRowMapper<>(Book.class);
        Book book = jdbcTemplate.queryForObject(sql, rowMapper, BookName);
        System.out.println(book);
    }

    @Override
    public void transferCount(Integer countOut,Integer countIn ,Integer Count) {
        String sql = "update bookstore set BookCount = BookCount - ? where BookId = ? ;";
        int giveBook = jdbcTemplate.update(sql, Count, countOut);
        int receiveBook = jdbcTemplate.update(sql, -Count, countIn);
if (giveBook==1&receiveBook==1) System.out.println("赠送成功");

    }
}
