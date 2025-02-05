package ss6.BaiTap;

public class Circle {
    private double radius;
    private String color;
    private boolean filled;
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius=radius;
        this.color =color;
        this.filled = true;
    }


    public String toString() {
        return "Radius is: " + this.radius + ", Color is: " + this.color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
