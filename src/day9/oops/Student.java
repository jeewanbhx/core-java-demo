package day9.oops;

public class Student {
    String studentName;
    int rollNo;


    public void displayStudentInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.displayStudentInfo();

        System.out.println("===========");

        Student student2 = new Student();
        student2.displayStudentInfo();
    }


}
//This is just an example.