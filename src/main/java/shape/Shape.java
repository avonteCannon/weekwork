package shape;

public class Shape {

    private double width;
    private double length;
    private double height;


    public Shape(){
    }

    public Shape(double width, double length, double height){

        this.width = width;
        this.length = length;
        this.height = height;
    }
    //GETTER
    public double getHeight() {
        return height;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    //SETTER
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }

    //METHOD
    public double calculateArea(){

        double x = height;
        double y = width;
        double z = length;

        double e = Math.pow(x, 2);

        double result = e;

        return result;
    }


    //tO - sTring
    @Override
    public String toString() {
        return "Shape{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}





