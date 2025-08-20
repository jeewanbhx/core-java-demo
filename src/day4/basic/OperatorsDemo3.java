package day4.basic;

public class OperatorsDemo3 {
    public static void main(String[] args) {
        //3. Increment/Decrement Operators
        // ++
        // post pre
        // a++ ++a a-- --a
        int a = 10;
        System.out.println(a);
        a++; //a+=1;//a = a + 1;
        System.out.println(a);

        int x = 5;
        System.out.println(x);//5
        System.out.println(x++);//5
        System.out.println(x);//6
        System.out.println(++x);//7

        int m = 8;
        int n = m++;
        System.out.println(m);//9
        System.out.println(n);//8


    }

}
