package ss3.BaiTap;

public class countCharacterAppearTwice {

    public static void main(String[] args) {
        String str = "sasakxcvccdd";
        int charCount = 0;
        int count;


        for (int i = 0; i <str.length();i++){
            count = 0;
            for (int j = 0; j <str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if (count == 2){
                charCount++;
            }
        }
        charCount = charCount/2; // each character is counted twice
        System.out.println(charCount);
    }

}
