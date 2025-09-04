package day6.basic;

public class ImplicitTypeCasting {
    public static void main(String[] args) {

        byte b = 100;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println("b is " + b);
        System.out.println("s is " + s);
        System.out.println("i is " + i);
        System.out.println("l is " + l);
        System.out.println("f is " + f);
        System.out.println("d is " + d);
    }
}
