package _12_Java_Collection_Framework.Bai_tap.Luyen_tap_su_dung_Arraylist_va_Linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product("Iphone", 1, 25.500);
        Product product1 = new Product("SamSung", 2, 24.500);
        Product product2 = new Product("Oppo", 3, 15.500);
        Product product3 = new Product("Xiaomi", 4, 10.500);

        ProductManager productManager = new ProductManager();

        List<Product> productList = productManager.getProductList();

        productManager.addProduct(product);
        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);

        productManager.displayProduct(productList);

//        // Kiem tra phuong thuc edit
//        productManager.editProduct(3);
//        System.out.println("The product after edited: ");
//        productManager.displayProduct(productList);

        //Kiem tra phuong thuc delete

//        productManager.deleteProduct(1);
//        System.out.println("The product after deleted: ");
//        productManager.displayProduct(productList);

        //Kiem tra phuong thuc findProduct

//        System.out.println("The product you want to find: ");
////        System.out.println(productManager.findProduct("Oppo"));

        // Kiem tra phuong thuc sap xep theo price
        System.out.println("List product after sort: ");
        productManager.sortProductList(productList);
        for (Product products : productList) {
            System.out.println(products);
        }


    }
}
