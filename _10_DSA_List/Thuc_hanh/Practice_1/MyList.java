package _10_DSA_List.Thuc_hanh.Practice_1;

import java.util.Arrays;

public class MyList<E> {
       private int size = 0;
       private static final int DEFAULT_CAPACITY = 10;
       private  Object elements[]; // tạo mảng ĐỐI TƯỢNG elements chứa các phần từ danh sách

    public MyList () {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Phương thức thay đổi số lượng phần tử trong danh sách
    // Tăng gấp đôi.
    private void ensureCapa () {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    // Phương thức add thêm vào phần tử vào cuối danh sách
    public void add(E e) {
        if ( size == elements.length) {
             ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if ( i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i) ;
        }
        return (E) elements[i];
    }


}
