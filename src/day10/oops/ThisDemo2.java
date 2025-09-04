package day10.oops;

public class ThisDemo2 {

    String name;
    int age;

    public ThisDemo2(String name, int age){
        name = name;
        age = age;


    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
