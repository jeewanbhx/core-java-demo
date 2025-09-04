package day14.arraydemo;

public class ForEachDemo2 {
    public static void main(String[] args) {

        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("====================");
            for (int[] row : arr) {
                for (int col : row) {
                    System.out.println(col + " ");
                }
                System.out.println();
            }
        }
    }
}
