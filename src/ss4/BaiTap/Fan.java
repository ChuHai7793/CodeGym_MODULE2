package ss4.BaiTap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed ;
    private boolean on;
    private double radius;
    private String color;
    public Fan(){
        this.speed =1;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    @Override
    public String toString(){

        if ( this.on){
            return "SPEED IS "+ speed+ ",COLOR IS " +color+", RADIUS IS "+radius+". FAN IS ON";
        } else {
            return "SPEED IS "+ speed+ ",COLOR IS " +color+", RADIUS IS "+radius+". FAN IS OFF";
        }
    }

    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }


    public boolean getStatus(){
        return this.on;
    }
    public void setStatus(boolean on){
        this.on = on;
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
}
