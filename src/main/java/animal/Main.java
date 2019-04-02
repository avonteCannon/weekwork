package animal;

public class Main {
    public static void main(String[] args) {

       Dog dog1 = new Dog("Buddy", "Dog Food", "Gold Retriever ");
        System.out.println(dog1.eat());

        Cat cat1 = new Cat("Mittens", "mice");
        System.out.println(cat1.eat());

        Wolf wolf1 = new Wolf("Max", "human");
        System.out.println(wolf1.eat());

        RoboDog robodog1 = new RoboDog();

        IGreet[] iGreets = new IGreet[]{dog1, robodog1};
        for(IGreet fakeObject : iGreets){
            fakeObject.greetMaster();
        }

    }
}
