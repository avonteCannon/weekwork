package shape;

public class MyCircle extends Shape{

    double cicumfrence;
    double radius;

    public MyCircle(double width, double length, double height, double radius, double cicumfrence){
        this.cicumfrence = cicumfrence;
        this.radius = radius;

    }

//    public double calculateMyCircleRadius(){
//
//        double radius = cicumfrence / (2 * 3.14159);
//        return radius;
//    }

    @Override
    public double calculateArea(){

        double area = 3.14159 * Math.pow(radius, 2);
        return area;
    }

}
