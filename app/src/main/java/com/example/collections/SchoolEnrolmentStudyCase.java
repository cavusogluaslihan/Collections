package com.example.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolEnrolmentStudyCase {
    public static void main (String args[]){

Scanner scanner = new Scanner(System.in);


        ArrayList<SchoolEnrolmentStudyCase_Students> students = new ArrayList<>();

        while (true){

            System.out.print("Enter the name and the surname of the student : ");
            String nameOfTheStudent = scanner.nextLine();

            System.out.print("Enter the id of the student : ");
            int idOfTheStudent = scanner.nextInt();
            scanner.nextLine();

            SchoolEnrolmentStudyCase_Students newStudent = new SchoolEnrolmentStudyCase_Students(nameOfTheStudent,idOfTheStudent);
            students.add(newStudent);

            String choice;
            do {
                System.out.print("Enter X to exit or 1 to continue! : ");
                choice = scanner.nextLine();

                if (!choice.equalsIgnoreCase("x") && !choice.equals("1")){
                    System.out.println("Please enter valid character!");
                }
            } while (!choice.equalsIgnoreCase("x") && !choice.equals("1"));

            if (choice.equalsIgnoreCase("x")){
                for (SchoolEnrolmentStudyCase_Students s:students){
                    System.out.println("-------");
                    System.out.println("Student ID             : "+s.getIdOfTheStudent());
                    System.out.println("Student Name & Surname : " + s.getNameOfTheStudent());
                }
                break;
            }

            }
        scanner.close();
        }

    }
