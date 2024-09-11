package com.example.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class RegisteredUserDataStudyCase {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<RegisteredUsers> users = new ArrayList<>();


        while (true) {

            System.out.print("Enter the username : ");
            String username = scanner.nextLine();

            int userId;
            boolean isUnique;

            do {
                System.out.print("Enter the user id : ");
                userId = scanner.nextInt();
                scanner.nextLine();
                isUnique = true;
                for (RegisteredUsers u : users) {
                    if (u.getUserId() == userId) {
                        System.out.println("This ID has already been used! Please enter a different ID. : ");
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);

            int userAge;

            do {
                System.out.print("Enter the user age : ");
                userAge = scanner.nextInt();
                scanner.nextLine();
                    if (userAge < 18) {
                        System.out.println("User must be 18 years and older. Please enter different age!");
                    } else if (userAge>99) {
                        System.out.println("Please enter valid age!");
                    }
            } while ((userAge < 18) || (userAge>99) );


            System.out.print("Enter the country : ");
            String countryOfUser = scanner.nextLine();

            RegisteredUsers newUser = new RegisteredUsers(username, userId, countryOfUser, userAge);
            users.add(newUser);

            String choice;
            do {
                System.out.println("Enter X to exit or 1 to continue! : ");
                choice = scanner.nextLine();
                if (!choice.equalsIgnoreCase("x") && !choice.equals("1")) {
                    System.out.println("Please enter valid character!");
                }
            } while (!choice.equalsIgnoreCase("x") && !choice.equals("1"));

            if (choice.equalsIgnoreCase("x")) {
                break;
            }
        }
        for (RegisteredUsers u : users) {
            System.out.println("-------");
            System.out.println("User ID  : " + u.getUserId());
            System.out.println("Username : " + u.getUserName());
            System.out.println("User Age : " + u.getAgeOfTheUser());
            System.out.println("Country  : " + u.getCountryOfTheUser());
        }
    }

}
