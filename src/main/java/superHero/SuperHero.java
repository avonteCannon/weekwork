package superHero;

import java.util.Arrays;

public class SuperHero {

    //VARIABLES
    protected String name;
    private String[] superPowers;

    //DEFULT
    public SuperHero(){

    }
    //CONTRUCTOR
    public SuperHero(String name, String[] superPowers){
        this.name = name;
        this.superPowers = superPowers;
    }
    //GETTERS & SETTERS?
    //==========================================================================================================

    //METHOD
    public String printSuperPowers(){
        String response = " ";

        for (int i = 0; i < superPowers.length; i++) {

            response = response + superPowers[i] + " ";
        }

        return name + " SUPER POWERS ARE: " + response;
    }
    //tO - Strings
    @Override
    public String toString() {
        return "SuperHero{" +
                "name='" + name + '\'' +
                ", superPowers=" + Arrays.toString(superPowers) +
                '}';
    }
}
