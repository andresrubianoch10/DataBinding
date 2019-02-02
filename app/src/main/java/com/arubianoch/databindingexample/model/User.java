package com.arubianoch.databindingexample.model;

/**
 * @author Andres Rubiano Del Chiaro
 */
public class User {

    public final String firstName;
    public final String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
