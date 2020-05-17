package cn.yuening.test;

import cn.yuening.service.AccountService;
import cn.yuening.service.Impl.AccountServiceImpl;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {


    @Test
    public void run1(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService accountService=(AccountService) ac.getBean("accountService");
        accountService.ListAccount();
    }
}
