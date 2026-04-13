/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.main.java1;


/**
 *
 * @author Student
 */
import java.util.Scanner;

public class MainJava1 {
    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
*/
        System.out.println("=== Registration1 ===");

       
        String firstName = promptForInput(scanner, "Enter first name: ");
        String lastName = promptForInput(scanner, "Enter last name: ");
        String username = promptForUsername(scanner);
        String password = promptForPassword(scanner);
        String cellPhone = promptForCellPhone(scanner);

        
        Registration1 reg = new Registration1(firstName, lastName, username, password, cellPhone);

      
        System.out.println("\n" + reg.registerUser());

       
        if (reg.checkUserName() && reg.checkPassword() && reg.checkCellPhoneNumber()) {

          
            Login1 login1 = new Login1(reg.getUsername(), reg.getPassword(), reg.getFirstName(), reg.getLastName());

            System.out.println("\n=== Login ===");

            String enteredUsername = promptForInput(scanner, "Enter username: ");
            String enteredPassword = promptForInput(scanner, "Enter password: ");

         
            System.out.println("\n" + login1.returnLoginStatus(enteredUsername, enteredPassword));
        } else {
            System.out.println("\nRegistration failed. Please fix the issues and try again.");
        }

        scanner.close();
    }


    private static String promptForInput(Scanner scanner, String promptMessage) {
        System.out.print(promptMessage);
        String input = scanner.nextLine();
        while (input.trim().isEmpty()) {
            System.out.print("This field is required. " + promptMessage);
            input = scanner.nextLine();
        }
        return input;
    }

 
    private static String promptForUsername(Scanner scanner) {
        String username = promptForInput(scanner, "Enter username (must contain _ and be max 5 characters): ");
        while (!username.contains("_") || username.length() > 5) {
            System.out.println("Invalid username! It must contain an underscore and be no more than 5 characters long.");
            username = promptForInput(scanner, "Enter username (must contain _ and be max 5 characters): ");
        }
        return username;
    }

   
    private static String promptForPassword(Scanner scanner) {
        String password = promptForInput(scanner, "Enter password (8+ chars, capital letter, number, special character): ");
        while (!isValidPassword(password)) {
            System.out.println("Invalid password! It must be at least 8 characters long, contain an uppercase letter, a number, and a special character.");
            password = promptForInput(scanner, "Enter password (8+ chars, capital letter, number, special character): ");
        }
        return password;
    }

    
    private static boolean isValidPassword(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*].*");
    }

  
    private static String promptForCellPhone(Scanner scanner) {
        String cellPhone = promptForInput(scanner, "Enter cell phone number (e.g. +27838968976): ");
        while (!cellPhone.matches("^\\+\\d{11,15}$")) {
            System.out.println("Invalid phone number format! It should start with '+' followed by 11 to 15 digits.");
            cellPhone = promptForInput(scanner, "Enter cell phone number (e.g. +27838968976): ");
        }
        return cellPhone;
    }
}




