package day8.basic;

import java.util.Scanner;

public class MethodDemo1 {

//
    public void greet(){
        System.out.println("Hello Hello Hello");
        //
    }
    public void displayInfo(String name, int age, double salary, boolean active) {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Salary is: " + salary);
        System.out.println("Status is: " + active);

    }

    public static void main(String[] args) {
        MethodDemo1 ob = new MethodDemo1();
        //method calling
        ob.greet();

        ob.displayInfo("ram", 22, 50000.22, true);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();
        System.out.println("Enter you status: ");
        boolean active = sc.nextBoolean();
        ob.displayInfo(name, age, salary, active);
    }

}
