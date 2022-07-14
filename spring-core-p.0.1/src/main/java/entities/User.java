package entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
public class User {
    private String name;

    public User() {
        this.name = "NoName";
    }

    public User(String name) {
        this.name = name;
    }

    public void initMessage() {
        System.out.println("User bean with name " + this.name + " was created.");
    }

    public void destroyMessage() {
        System.out.println("User bean with name " + this.name + " was destroyed.");
    }
}
