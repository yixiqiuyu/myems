package com.gejian.test;

import com.gejian.dao.AdminMapper;
import com.gejian.entity.Admin;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestDao {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-cofig.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
        //Admin admin=mapper.findById(1);
        //Admin admin = mapper.findByUserName("gejian");
        //System.out.println(admin);
        /*Admin admin=mapper.findById(3);
        admin.setPassword("123");*/
        List<Admin> adminList = mapper.findAllAdmins();
        for (Admin admin:adminList) {
            System.out.println(admin);
        }
    }
}
