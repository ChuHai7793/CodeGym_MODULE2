package ss7.BaiTap;

import ss7.BaiTap.Colorable;

public class ColorableTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(2,3);
        for (Shape shape:shapes){
            if (shape instanceof Circle){
                ((Circle) shape).howToColor();
            }
        }
    }
}
