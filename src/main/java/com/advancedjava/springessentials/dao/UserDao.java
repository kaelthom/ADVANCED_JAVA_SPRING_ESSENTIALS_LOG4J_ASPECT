package com.advancedjava.springessentials.dao;

import com.advancedjava.springessentials.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao {

    private Map<String, User> users = new HashMap<String, User>() {
        {
            put("John", new User("John", "Doe", 200));
            put("Jack", new User("Jack", "Doe", 300));
            put("Jenny", new User("Jenny", "Doe", 400));

        }
    };

    public UserDao() {
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public User findUser(String name) {
        return users.get(name);
    }

    public User addUser(User user) {
        return users.put(user.getLastname(), user);
    }
}
