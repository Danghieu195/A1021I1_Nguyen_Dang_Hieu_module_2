package _17_IO_Binary_File_And_Serialization.Bai_tap.Bai_1.services;

import _12_Java_Collection_Framework.Bai_tap.Luyen_tap_su_dung_Arraylist_va_Linkedlist.Cach_1.Product;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if (p1.getPrice() > p2.getPrice())
            return 1;
        else if (p1.getPrice() < p2.getPrice())
            return -1;
        return 0;
    }

}
