/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.java1;

/**
 *
 * @author Student
 */
public class Registration1 {
     private String firstName;
    private String lastName;
    private String username;
    private String cellPhoneNumber;

    private Password1 passwordObj;

   
    public Registration1(String firstName,
                        String lastName,
                        String username,
                        String password,
                        String cellPhoneNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.cellPhoneNumber = cellPhoneNumber;

        passwordObj = new Password1(password);
    }

  
    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

   
    public boolean checkPassword() {
        return passwordObj.checkPasswordComplexity();
    }

   
    public boolean checkCellPhoneNumber() {
        return cellPhoneNumber.matches("\\+27\\d{9}");
    }

   
    public String registerUser() {

        if (!checkUserName()) {
            return "please ensure that your username contains an underscore and is no more than five characters in length.";
        }

        if (!checkPassword()) {
            return " please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

        if (!checkCellPhoneNumber()) {
            return "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.";
        }

        return "Username successfully captured.\n" +
               "Password successfully captured.\n" +
               "Cell number successfully captured.";
    }

    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return passwordObj.getPassword();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
