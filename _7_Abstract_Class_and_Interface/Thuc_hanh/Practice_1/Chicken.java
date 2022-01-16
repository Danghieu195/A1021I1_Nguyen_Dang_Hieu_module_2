package _7_Abstract_Class_and_Interface.Thuc_hanh.Practice_1;

public class Chicken extends Animal implements Eddible {
    @Override
    public String makeSound() {
        return "ChicKen: Cluck Cluck!";
    }

    @Override
    public String howToEat() {
        return "ChicKen could be fried";
    }
}
