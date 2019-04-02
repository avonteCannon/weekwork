package animal;

public class Dog extends CainNine implements IGreet{

    public Dog(String name, String food, String breed){
        super(name, food);
        this.breed = breed;

    }
    public String eat(){
        return breed + "Dog's eat Cat's";
    }

    public void greetMaster(){
        System.out.println("sniff you and wag tail");
    }


}
