package ss3.BaiTap;

public class calSumCol {
    public static void main(String[] args) {

        int[][] arr2Dimension = {{1, 2, 3, 99, 5}, {6, 7, 8,7},{9,10,7}};
        int colSum = 0;
        int col = 3;

        for (int i = 0 ; i< arr2Dimension.length; i++){
            if (arr2Dimension[i].length > col){
                colSum += arr2Dimension[i][col];
            }

        }
        System.out.println(colSum);
    }
}
