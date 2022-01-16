package _5_Access_modifier_static_method_static_property.Thuc_hanh;

public class Static_property {
    public static void main(String[] args) {
        Car c1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car c2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }

}


class Car {
    private String name;
    private String  engine;

    public static int numberOfCars;

    // tao Constructor
    public Car (String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;

    }

}
