package _17_IO_Binary_File_And_Serialization.Bai_tap.Bai_1.models;

import java.io.Serializable;

public class Product implements Serializable {
    protected int ID;
    protected String productName;
    protected String manufacturer;
    protected double price;

    public Product() {
    }

    public Product(int ID, String productName, String manufacturer, double price) {
        this.ID = ID;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
}
