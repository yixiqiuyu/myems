package com.gejian.test;

import com.gejian.dao.AdminMapper;
import com.gejian.entity.Admin;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class TestDao {
    public static void main(String[] args) throws IOException {
        String resource="mybatis-cofig.xml";
        InputStream is= Resources.getResourceAsStream(resource);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
        Admin admin=mapper.findById(1);
        System.out.println(admin);
    }
}
