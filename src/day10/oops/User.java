package day10.oops;

public class User {
    String name = "ram";
    int age = 20;

    public static void main(String[] args) {
        User user1 = new User();
        //set
        user1.name = "John";
        user1.age = 20;
        //get
        System.out.println(user1.name);
        System.out.println(user1.age);

        System.out.println("===============");

        User user2 = new User();
        user2.name = "Eliza";
        user2.age = 40;

        System.out.println(user2.name);
        System.out.println(user2.age);



    }
}
