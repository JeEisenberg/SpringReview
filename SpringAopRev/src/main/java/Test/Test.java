package Test;

import com.gavin.dao.UserDao;
import com.gavin.dao.UserDaoImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
    @org.junit.Test//注解类型要明确
    public void test(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao =(UserDao) ac.getBean("userDao");
        userDao.lendBook();
    }
}
