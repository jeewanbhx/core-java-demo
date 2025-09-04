package day7.basic;

import java.util.Scanner;

public class SwtichCaseDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice");
        String choice = sc.next();

        switch (choice) {
            case "add":
                System.out.println("Addition");
                break;
            case "Subtraction":
                    System.out.println("Subtraction");
                    break;
            case "Multiplication":
                System.out.println("Multiplication");
                break;
            case "Division":
                System.out.println("Division");
                break;
            default:
                System.out.println("Invalid Choice");

        }
        System.out.println("rest of the code");
    }
}
