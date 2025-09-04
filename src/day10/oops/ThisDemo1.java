package day10.oops;

public class ThisDemo1 {

    int a =5;
    public void display() {
        System.out.println(a);
        int a = 6;
        System.out.println(a);
    }

    public static void main(String[] args) {
        ThisDemo1 obj = new ThisDemo1();
        obj.display();
    }
}
