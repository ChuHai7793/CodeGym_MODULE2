package ss6.BaiTap;

import java.lang.Math;

public class Cylinder extends Circle{

    private double height;

    public Cylinder(){
    }

    public Cylinder(double height){
        this.height = height;
    }

    public double calcVolume(){
        return this.height*Math.pow(this.getRadius(),2)*Math.PI;
    }

    @Override
    public String toString(){
        return "Radius is: " + this.getRadius() + ", Color is: " + this.getColor();
    }
}
