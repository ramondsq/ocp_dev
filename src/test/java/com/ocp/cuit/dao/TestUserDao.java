package com.ocp.cuit.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestUserDao {
    @Autowired
    private UserDao userDao;

    @Test
    public void testGetAllRetailers() {
        System.out.println(userDao.getAllRetailers());
    }

    @Test
    public void testGetAllRetailerAddress() {

    }

    @Test
    public void testGetAllOperators() {
        System.out.println(userDao.getAllOperators());
    }
}
