package com.gejian.dao;

import com.gejian.entity.Admin;

import java.util.List;

public interface AdminMapper {
    Admin findById(Integer id);
    Admin findByUserName(String userName);
    Admin findByUserNameAndPassword(Admin admin);
    int updateUser(Admin admin);
    int deleteUser(Integer id);
    int insertUser(Admin admin);
    List<Admin> FindAllAdmins();
}
