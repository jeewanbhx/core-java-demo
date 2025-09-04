package day9.oops;

public class User {

    String name;
    int age;

 //   public void assignUserInfo(String n, int a) {
 //       name = n;
   //     age = a;
    public User(String n, int a){
        name = n;
        age = a;
        System.out.println("constructor called");



    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

    public static void main(String[] args) {
        User user1 = new User("Ram", 56);
 //       user1.assignUserInfo("John Doe", 10);
   //     user1.displayInfo();
        user1.displayInfo();

        System.out.println("================");

        User user2 = new User("Hari", 34);
//        user2.assignUserInfo("Shyam", 40);
        user2.displayInfo();

 //       System.out.println("========");
 //       user1.assignUserInfo("Eliza", 30);


    }


}
//constructor: is a special member function which has following characteristics:
//it's name is same as class name
// we cannot use "void" keyword
//we can use any access modifier
//it is used to initialize member's data
//it runs only once for each object.