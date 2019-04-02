package shape;

import java.awt.geom.Area;

public class MyTriangle extends Shape {

    //Variables
    private double base;

    // Constructor
    public MyTriangle(double width, double length, double height, double base){
        super(width, length, height);
        this.base = base;
    }

    //Method
    @Override
    public double calculateArea(){

        double Area = getHeight() * base / 2;

        return Area;
    }

}
