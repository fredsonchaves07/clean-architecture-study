package com.fredsonchaves.thenote.domain.entities;

public class User {

    private Email email;
    private Password password;

    public static create(String email, String password) {
        this.email = Email.create(email);
        this.password = Password.create(password);
    }

    public Email getEmail() {
        return email;
    }

    public Password getPassword() {
        return password;
    }
}
