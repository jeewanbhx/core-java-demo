package day6.basic;

import org.w3c.dom.ls.LSOutput;

public class NestedIfElseDemo {
    public static void main(String[] args) {
        int a = 14;
        int b = 5;
        int c = 17;
        if (a > b) {
            if (a > c) {
                System.out.println("a is largest one.");
            } else {
                System.out.println("c is the largest one.");
            }
        } else {
            if (b > c) {
                System.out.println("b is the largest one.");
            }else{
                System.out.println("c is the largest one.");
            }
        }
        System.out.println("rest of the code");

    }

}
