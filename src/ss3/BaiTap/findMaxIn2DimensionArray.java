package ss3.BaiTap;

public class findMaxIn2DimensionArray {
    public static void main(String[] args) {

        int[][] arr2Dimension = {{1, 2, 3, 99, 5}, {6, 7, 8}};
        int maxValue = arr2Dimension[0][0];

        for (int i = 0; i < arr2Dimension.length; i++) {
            for (int j =0 ; j<arr2Dimension[i].length;j++){
                if (arr2Dimension[i][j]>maxValue){
                    maxValue = arr2Dimension[i][j];
                }
            }
        }

        System.out.println(maxValue);


    }
}
