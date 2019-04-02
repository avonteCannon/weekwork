package superHero;

public class IceMan extends SuperHero{

    public IceMan(){
    }

    public IceMan(String name, String[] superPowers){
        super(name, superPowers);
    }

    @Override
    public String printSuperPowers(){
        return super.printSuperPowers();
    }
}
