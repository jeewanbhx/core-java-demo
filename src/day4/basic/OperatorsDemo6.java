package day4.basic;

public class OperatorsDemo6 {

    public static void main(String[] args) {
        //Ternary (conditional) operator
        // ?

        int a = 100;
        int b = 20;

        if(a > b) {
            System.out.println("a is greator than b.");
        } else {
            System.out.println("b is greator than a.");
        }

        String s = (a > b)? "a is greator than b" : "b is greator than a";
        System.out.println(s);
        boolean bb = (a > b) ? true : false;
        System.out.println(bb);

        int r = (a > b) ? 1 : 0;
        System.out.println(r);




    }

}
