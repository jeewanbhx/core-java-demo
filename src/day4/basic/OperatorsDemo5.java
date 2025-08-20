package day4.basic;

public class OperatorsDemo5  {

    public static void main(String[] args) {
        // 5. Logical Operators: &&(and) ||(or) !(not)

        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(true && true); //true
        System.out.println(a < b && b < c );//true
        System.out.println(true && false);//false
        System.out.println(a < b && b > c);//false;
        System.out.println(false && true);//false
        System.out.println(a > b && b < c); //false
        System.out.println(false && false);//false
        System.out.println(a > b && b > c); // false

        //==============================================//
        System.out.println(true || true); //true
        System.out.println(a < b || b < c );//true
        System.out.println(true || false);//true
        System.out.println(a < b || b > c);//true;
        System.out.println(false || true);//true
        System.out.println(a > b || b < c); //true
        System.out.println(false || false);//false
        System.out.println(a > b || b > c); // false

        //=====================================================//
        System.out.println(!true); //false
        System.out.println(!(a < b));//true
        System.out.println(!(false));//true
        System.out.println(!(a>b));//true





    }
}
