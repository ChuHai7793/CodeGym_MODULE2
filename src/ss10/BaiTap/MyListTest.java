package ss10.BaiTap;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        MyList<Integer> l = new MyList<Integer>(4);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        l.add(3,100);
        l.clear();
        l.add(60);
//        l.remove(1);

//        MyList<Integer> l1 = (MyList<Integer>) l.clone();
//
//        System.out.println( l1.indexOf(100));

        for (int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }




    }
}
