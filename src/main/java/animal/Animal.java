package animal;

public abstract class Animal {

    private String name;
    private String food;
    protected String breed;


    public Animal(String name, String food) {
        this.name = name;
        this.food = food;
    }

    abstract public String eat();

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}
