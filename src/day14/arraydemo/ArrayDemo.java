package day14.arraydemo;

public class ArrayDemo {
    public static void main(String[] args) {


        int [] arr = new int [3];
        System.out.println(arr);
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[0] = 11;
        arr[1] = 12;
        arr[2] = 13;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


    }
}
