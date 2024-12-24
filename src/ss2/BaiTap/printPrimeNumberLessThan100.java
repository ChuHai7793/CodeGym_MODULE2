package ss2.BaiTap;


public class printPrimeNumberLessThan100 {
    static Boolean PrimeCheck (int number) {

        if (number < 2) {
            System.out.println(number + "is not a number");
        } else {
            int i = 2;
            boolean check = true;

            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            return check;
        }
        return false;
    }

    public static void main(String[] args) {

      for (int i = 2; i<=100;i++){
          if (PrimeCheck(i)){
              System.out.println(i);
          }

      }
    }
}
