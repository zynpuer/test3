package cn.yuening.test;

import cn.yuening.dao.AccountDao;
import cn.yuening.entity.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    @Test
    public void run() throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
// 创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
// 创建sqlSession对象
        SqlSession session = factory.openSession();
// 获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
// 调用查询的方法
        List<Account> list = dao.ListAccount();
        for (Account account : list) {
            System.out.println(account);
        }
// 释放资源
        session.close();
        inputStream.close();
    }

    @Test
    public void run2()throws Exception{
        Account account = new Account();
        account.setName("熊大");
        account.setMoney(400);
// 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
// 创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
// 创建sqlSession对象
        SqlSession session = factory.openSession();
// 获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);

        dao.SaveAccount(account);
// 提交事务
        session.commit();
// 释放资源
        session.close();
        inputStream.close();
    }
    @Test
    public void run3()throws Exception{
// 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
// 创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
// 创建sqlSession对象
        SqlSession session = factory.openSession();
// 获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);

        for (Account account: dao.ListAccount()
             ) {
            System.out.println(account.toString());
        }
// 提交事务
        session.commit();
// 释放资源
        session.close();
        inputStream.close();
    }
}
