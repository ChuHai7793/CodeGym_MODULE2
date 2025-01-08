package ss2.BaiTap;


public class printPrimeNumberLessThan100 {
    static Boolean PrimeCheck (int number) {
        if (number >= 2) {
            int i = 2;
            while (i < number) {
                if (number % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
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
