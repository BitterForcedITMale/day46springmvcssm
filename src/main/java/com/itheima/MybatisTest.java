package com.itheima;

import com.itheima.dao.AccountDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {
    @Test
    public void test() throws IOException {
        // 读取文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-cofig.xml");

        // 解析得到一个sqlsessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        // 获取一个sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获得一个代理对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        // 执行
        System.out.println(accountDao.findAll());

        // 关闭sqlsession
        sqlSession.close();
    }
}
