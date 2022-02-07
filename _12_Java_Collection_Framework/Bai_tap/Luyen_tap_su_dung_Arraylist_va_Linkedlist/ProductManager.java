package _12_Java_Collection_Framework.Bai_tap.Luyen_tap_su_dung_Arraylist_va_Linkedlist;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner sc = new Scanner(System.in);

    private List<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct( Product product) {
        productList.add(product);
    }

    public void displayProduct ( List<Product> productList) {
        for ( Product product : productList ) {
            System.out.println(product);
        }
    }

    public Product findProduct( String name) {
        boolean checkName = false;
        int index = 0;
        Product foundProduct = null;

        for ( int i = 0; i < productList.size(); i++) {
            if ( productList.get(i).getName() == name) {
                checkName = true;
                index = i;
                break;
            }
        }

        if (checkName) {
            foundProduct = productList.get(index);
        } else {
            System.out.println("Please check the name of product!!");
        }

        return foundProduct;
    }

    public void editProduct( int id ) {
        boolean checkId = false;
        int index = 0;

        for ( int i = 0; i < productList.size(); i ++) {
            if( productList.get(i).getId() == id) {
                checkId = true;
                index = i;
                break;
            }
        }

        if ( checkId) {
            Product product = productList.get(index);

            System.out.println("Please enter a new name: ");
            String newName = sc.nextLine();
            product.setName(newName);

            System.out.println("Please enter price: ");
            double newPrice = Double.parseDouble(sc.nextLine());
            product.setPrice(newPrice);

        } else {
            System.out.println("Please check the ID of product!!");
        }
    }

}
