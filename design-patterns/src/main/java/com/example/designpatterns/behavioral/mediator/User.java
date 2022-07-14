package com.example.designpatterns.behavioral.mediator;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private Group group;

    public void saySomething(String message) {
        group.say(this, message);
    }
}
