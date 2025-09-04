package day14.arraydemo;

public class ForEachDemo1 {
    public static void main(String[] args) {
        int [] arr = {4,5,6};
        for (int i = 0; i <arr.length; i++){
            System.out.println(i);
        }
        System.out.println("=====================");
        for(int a: arr){
            System.out.println(a);
        }
    }
}
