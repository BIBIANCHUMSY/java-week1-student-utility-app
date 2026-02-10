package jug;

import java.util.Scanner;

public class StudentUtilityApp {

        //the Method that displays the menu
        static void displayAppMenu() {
            System.out.println("=== STUDENT UTILITY APP ===");
            System.out.println("1. Add two numbers");
            System.out.println("2. Check if a number is EVEN or ODD");
            System.out.println("3. Print numbers from 1 to N");
            System.out.println("4. Display day of the week");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
        }

        //this method add two numbers
        static void addTwoNumbers(Scanner input) {
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            int sum = num1 + num2;
            System.out.println("Result: " + sum);

        }

        //Method to check EVEN or ODD using tenary operator
        static void checkEvenOrOdd(Scanner input) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            String result = (number % 2 == 0) ? "EVEN" : "ODD";
            System.out.println("The number is " + result);

        }

        //method to print numbers from 1 to N
        static void printNumbers(Scanner input) {
            System.out.print("Enter a number N: ");
            int n = input.nextInt();

            for (int i = 1; i <= n; i++){
                System.out.println(i);

            }
        }

        //method that display day of the week using switch
        static void displayDay(Scanner input) {
            System.out.print("Enter a number (1 - 7): ");
            int day = input.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid day");
            }
        }

   //Main method
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int choice;

         do {
             displayAppMenu();
             choice = input.nextInt();

             if (choice == 1) {
                 addTwoNumbers(input);
             } else if (choice == 2) {
                 checkEvenOrOdd(input);
             } else if (choice == 3) {
                 printNumbers(input);
             } else if (choice == 4) {
                 displayDay(input);
             } else if (choice == 5) {
                 System.out.println("Thank you for using the app");
             } else {
                 System.out.println("Invalid option, try again");
             }
         }  while (choice != 5);

         input.close();
    }
}