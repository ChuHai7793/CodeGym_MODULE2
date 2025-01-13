package ss10.BaiTap;

import java.util.Arrays;

public class MyList<E> implements Cloneable{
    private int size=0;
    static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

//    @Override
//    public String toString(){
//
//        return elements.toString();
//    }
    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    public void add(int index, E e) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }

        if (size == elements.length) {
            ensureCapacity();
        }

        for (int i =0;i<elements.length-1;i++){
            if (i>=index){
                elements[i+1] = elements[i];
            }
        }
        size++;
        elements[index] = e;
    }

    public E remove(int index){
        E removedElement = (E) elements[index];
        for (int i=0; i<elements.length -1;i++){
            if (i >= index){
                elements[i] = elements[i+1];
            }
        }
        size--;
        elements = Arrays.copyOf(elements, size);
        return  removedElement;
    }

    public boolean contain(E o){

        for (int i = 0; i<elements.length;i++){
            if (elements[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o){
        for (int i = 0; i<elements.length;i++){
            if (elements[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    public void clear(){
        size = 0;
        elements = new Object[DEFAULT_CAPACITY];
    }


    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public int size() {
        return size;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
