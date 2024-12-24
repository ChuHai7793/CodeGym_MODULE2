package ss3.BaiTap;

public class SumSquareMatrix {
    public static void main(String[] args) {

        int[][] arr2Dimension = {{1, 2, 3},
                                {6, 7, 8},
                                {9, 10, 7}};
        int diagonalSum = 0;


        for (int i = 0; i < arr2Dimension.length; i++) {
            for (int j = 0; j < arr2Dimension[i].length; j++) {

                if (j == i) {
                    diagonalSum += arr2Dimension[i][j];
                }
            }
        }
        System.out.println(diagonalSum);
    }
}
