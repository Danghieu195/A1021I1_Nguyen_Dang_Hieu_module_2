package _12_Java_Collection_Framework.Bai_tap.Luyen_tap_su_dung_Arraylist_va_Linkedlist.Cach_2;

public class Stuff implements Comparable<Stuff> {
    private int id;
    private String name;
    private double price;


    public Stuff(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Stuff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // Sắp xếp giảm dần theo giá

    @Override
    public int compareTo(Stuff o) {
        return (int) getPrice() - (int) o.getPrice();
    }

    @Override
    public boolean equals(Object obj) {
        return name == ((Stuff) obj).getName();
    }
}
