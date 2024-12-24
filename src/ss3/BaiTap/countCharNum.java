package ss3.BaiTap;

public class countCharNum {
    public static void main(String[] args) {

        String str = "sadsadsadasdxcvv";
        char charCheck = 'a';
        int count = 0;
        for (int i = 0; i<str.length();i++){
            if (str.charAt(i) == charCheck){
                count++;
            }
        }
        System.out.println(count);

    }
}
