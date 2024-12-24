package ss7.BaiTap;

import ss7.BaiTap.Resizable;
import ss7.BaiTap.Circle;
import ss7.BaiTap.Rectangle;
import ss7.BaiTap.Shape;



public class ResizableTest {
    public static void main(String[] args) {

        Shape[] shapeArr = new Shape[2];
        shapeArr[0] = new Circle(5);
        shapeArr[1] = new Rectangle(3,2);

        for (Shape shape:shapeArr){
            if (shape instanceof Circle){
                Resizable resizableCircle = (Circle) shape;
                System.out.println(resizableCircle.resize(5));
            }
        }


    }
}
