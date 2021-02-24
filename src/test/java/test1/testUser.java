package test1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

public class testUser {
    @Test
   public void testAdd(){
        //加载配置文件
        ApplicationContext context= new ClassPathXmlApplicationContext("beans1.xml");
       User user= (User)context.getBean("user");
       user.add();
    }
}
