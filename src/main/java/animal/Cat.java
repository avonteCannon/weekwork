package animal;

public class Cat extends Animal{

    public Cat(String name, String food) {
        super(name,food);
    }

    public String eat() {
        return getName() + " eats " + getFood();
    }
}
