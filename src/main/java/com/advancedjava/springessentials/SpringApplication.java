package com.advancedjava.springessentials;

import com.advancedjava.springessentials.dao.UserDao;
import com.advancedjava.springessentials.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class SpringApplication {
    @Autowired
    UserDao userDao;

    public void run() {
        System.out.println(userDao.findUser("John"));
        userDao.addUser(new User("Jacky", "Doe"));
    }
}
