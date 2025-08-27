package day8.basic;

public class NonStaticStaticDemo {
    //non-static (instance) variable
    int a = 5;

    //static variable (class level variable)
    static int b = 6;


    //non-static method (class level behavior)
    public void sayHello() {
        System.out.println("Hello");
    }
    //static method
    public static void sayHI(){
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        NonStaticStaticDemo ob = new NonStaticStaticDemo();
        System.out.println(ob.a);
        ob.sayHello();

        System.out.println(b);
        sayHI();

        System.out.println(NonStaticStaticDemo.b);
        NonStaticStaticDemo.sayHI();


    }
}
