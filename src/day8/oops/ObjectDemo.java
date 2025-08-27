package day8.basic;

public class ObjectDemo {

    public static void main(String[] args) {
        ObjectDemo ob1 = new ObjectDemo();// int a =5
        System.out.println(ob1);

        ObjectDemo ob2;
        ob2 = new ObjectDemo();
        System.out.println(ob2);

        // anonymous object
        new ObjectDemo();
        System.out.println( new ObjectDemo());



    }
}
//class: is a specification/template/prototype
//object: is an instant of class which has properties and behavior
