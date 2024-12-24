package ss4.BaiTap;

import java.util.Scanner;

public class QuadraticEquationClass {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a,b,c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();


        QuadraticEquation equation = new QuadraticEquation(a,b,c);

        if (equation.getDiscriminant()>0){
            System.out.println("This equation has 2 roots:"+equation.getRoot1()+"and"+equation.getRoot2());
        } else if (equation.getDiscriminant()==0){
            System.out.println("This equation has 1 root:"+equation.getRoot1());
        } else {
            System.out.println("This equation has no real root");
        }
    }
}
