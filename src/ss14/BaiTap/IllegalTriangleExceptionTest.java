package ss14.BaiTap;

public class IllegalTriangleExceptionTest {

    public static class IllegalTriangleException extends Exception{
        public IllegalTriangleException(){
        }
    }
    // Method to check if three sides form a triangle
    public static boolean isTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side2 + side3 > side1);
    }

    public static void main(String[] args){
        try{
            double side1 = 3, side2 = 4, side3 = 5; // Valid triangle
            double side4 = 1, side5 = 2, side6 = 3; // Not a triangle
            if (!isTriangle(side4,side5,side6)){
                throw new IllegalTriangleException();
            }


        } catch(IllegalTriangleException e){
            System.out.println("LOI");
        }

    }
    int b= 2;
    Integer a =1;

}
