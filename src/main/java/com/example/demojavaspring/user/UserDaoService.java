package com.example.demojavaspring.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int usersCount = 4;

    static {
        users.add(new User(1, "Rox", new Date()));
        users.add(new User(2, "AJ", new Date()));
        users.add(new User(3, "Kylo", new Date()));
        users.add(new User(4, "Zeke", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user:users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User deleteUserById(int id) {
        Iterator<User> iterator = users.iterator();

        while(iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}
