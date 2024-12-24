package ss4.BaiTap;

public class FanClass {
    public static void main(String[] args){

        Fan fan1 = new Fan();

        fan1.setStatus(true);
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");

        System.out.println(fan1);
    }
}
