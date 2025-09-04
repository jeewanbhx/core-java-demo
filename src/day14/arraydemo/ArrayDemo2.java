package day14.arraydemo;

import java.util.Scanner;

public class ArrayDemo2 {

    public static void main(String[] args) {
        int[] a = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++){
            System.out.println("Enter a Element " + i + ": ");
            a[i] = scanner.nextInt();

        }
        int sum = 0;
        for (int i = 0; i < a.length; i++);
        {
            System.out.println(a[1]);
            sum += a[1];
        }
        System.out.println("The sum fo all element is: " + sum);

    }
}
