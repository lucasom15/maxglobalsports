package com.mgs;

     import java.util.Scanner;

     public class Main {
         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             EmployeeManager employeeManager = new EmployeeManager();

             while (true) {
                 System.out.println("1. Add Employee");
                 System.out.println("2. View Employee");
                 System.out.println("3. Exit");
                 System.out.print("Choose an option: ");
                 int option = scanner.nextInt();
                 scanner.nextLine();  // Consume newline

                 switch (option) {
                     case 1:
                         System.out.print("Enter ID: ");
                         String id = scanner.nextLine();
                         System.out.print("Enter Name: ");
                         String name = scanner.nextLine();
                         System.out.print("Enter Medical Conditions: ");
                         String medicalConditions = scanner.nextLine();
                         System.out.print("Enter Allergies: ");
                         String allergies = scanner.nextLine();
                         System.out.print("Enter Contact Phone: ");
                         String contactPhone = scanner.nextLine();
                         System.out.print("Enter Contact Email: ");
                         String contactEmail = scanner.nextLine();

                         Employee employee = new Employee(id, name, medicalConditions, allergies, contactPhone, contactEmail);
                         employeeManager.addEmployee(employee);
                         System.out.println("Employee added successfully.");
                         break;

                     case 2:
                         System.out.print("Enter Employee ID: ");
                         String searchId = scanner.nextLine();
                         employeeManager.displayEmployee(searchId);
                         break;

                     case 3:
                         System.out.println("Exiting...");
                         scanner.close();
                         return;

                     default:
                         System.out.println("Invalid option. Please try again.");
                         break;
                 }
             }
         }
     }