package superHero;

public class Main {
    public static void main(String[] args) {

        SuperHero iceman = new IceMan("Ice Man", new String[]{"Ice beam", "Ice armor", "Ice blast"});
        System.out.println(iceman.printSuperPowers());

        SuperHero flash = new Flash("Flash", new String[]{"Super Speed", "Time Travel"});
        System.out.println(flash.printSuperPowers());





    }
}
