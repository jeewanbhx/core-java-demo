package day8.oops;

public class MethodDemo2 {

    public int sum(){
        int a = 6;
        int b = 7;
        int add = a + b;
        return add;


    }
    public String displayInfo(String name, int age, double salary, boolean active) {
        String info = "Name: " + name +", Age: " + age + ", Salary: " + salary+ ", Active: " + active;
        return info;
    }

    public static void main(String[] args) {
        MethodDemo2 ob = new MethodDemo2();
        int r = ob.sum();
        System.out.println(r);

        String info = ob.displayInfo("raju", 12, 233.54, true);
        System.out.println(info);
    }

}
