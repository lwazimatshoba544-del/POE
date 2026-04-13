/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.java1;

/**
 *
 * @author Student
 */
public class Login1 {
  private String storedUsername;
    private String storedPassword;
    private String firstName;
    private String lastName;

    // Constructor
    public Login1(String username,
                 String password,
                 String firstName,
                 String lastName) {

        this.storedUsername = username;
        this.storedPassword = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Check login
    public boolean loginUser(String enteredUsername,
                             String enteredPassword) {

        return storedUsername.equals(enteredUsername)
                && storedPassword.equals(enteredPassword);
    }

    // Login message
    public String returnLoginStatus(String enteredUsername,
                                    String enteredPassword) {

        if (loginUser(enteredUsername, enteredPassword)) {

            return "Welcome " +
                    firstName + " " +
                    lastName +
                    " it is great to see you again.";

        } else {

            return "Username or password incorrect, please try again.";
        }
    }
  
}
