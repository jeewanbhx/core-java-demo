package day7.basic;

public class WhileLoopDemo1 {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;
        while (i <= 5) {
            sum += 1;
            System.out.println("i is: " +i);
        }
        System.out.println("sum is: " +sum);
    }
}
