package _12_Java_Collection_Framework.Bai_tap.Luyen_tap_su_dung_Arraylist_va_Linkedlist.Cach_1;

import java.util.Comparator;

public class priceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if ( p1.getPrice() > p2.getPrice()) {
            return 1;
        } else if ( p1.getPrice() == p2.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
}
