package shape;

public class Main {
    public static void main(String[] args) {

        Shape triangle = new MyTriangle(3.0, 4.0, 8.0, 4.0);
        System.out.println(triangle.calculateArea());
        Shape square = new MySquare(8.0, 8.0, 8.0, "Black");
        System.out.println(square.calculateArea());
        Shape circle = new MyCircle(5.0, 5.0, 5.0, 5.0, 5.0);
        System.out.println(circle.calculateArea());


    }
}
