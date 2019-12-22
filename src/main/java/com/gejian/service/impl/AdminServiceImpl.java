package com.gejian.service.impl;

import com.gejian.dao.AdminMapper;
import com.gejian.entity.Admin;
import com.gejian.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin findById(Integer id) {
        return adminMapper.findById(id);
    }

    @Override
    public Admin findByUserName(String userName) {
        return adminMapper.findByUserName(userName);
    }

    @Override
    public Admin findByUserNameAndPassword(Admin admin) {
        return findByUserNameAndPassword(admin);
    }

    @Override
    public int updateUser(Admin admin) {
        return adminMapper.updateUser(admin);
    }

    @Override
    public int deleteUser(Integer id) {
        return adminMapper.deleteUser(id);
    }

    @Override
    public int insertUser(Admin admin) {
        return adminMapper.insertUser(admin);
    }

    @Override
    public List<Admin> findAllAdmins() {
        return adminMapper.findAllAdmins();
    }
}
