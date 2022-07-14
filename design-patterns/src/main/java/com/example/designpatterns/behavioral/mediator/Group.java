package com.example.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<User> users;

    public Group() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void say(User user, String message) {
        // Store message in database logic
        boolean isPartOfGroup = users
                .stream()
                .anyMatch(u -> u.getUsername().equals(user.getUsername()));
        if (isPartOfGroup) {
            System.out.println(user.getUsername() + ": " + message);
        }
    }
}
