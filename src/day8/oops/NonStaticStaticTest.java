package day8.oops;

public class NonStaticStaticTest {
    public static void main(String[] args) {
        NonStaticStaticDemo ob = new NonStaticStaticDemo();
        System.out.println(ob.a);
        ob.sayHello();

        System.out.println(NonStaticStaticDemo.b);
        System.out.println("Hello!");

    }
}
