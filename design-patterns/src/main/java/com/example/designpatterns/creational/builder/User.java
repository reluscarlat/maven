package com.example.designpatterns.creational.builder;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    @Setter
    @Getter
    private String firstName;

    @Setter
    @Getter
    private String lastName;

    public static class UserBuilder {

        private String firstName;
        private String lastName;

        public UserBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public User build() {
            return new User(this.firstName, this.lastName);
        }
    }
}
