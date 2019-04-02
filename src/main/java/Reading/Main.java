package Reading;
//access modifier(public)
public class Main {
    public static void main(String[] args) {

        //Fundamental Programming Structures in Java
        //3.1 A Simple Java Program
        //prints to the console (System.out.println)
        System.out.println("Hello World!");

        //3.2 Comments
        // = single line comment
        // /* */ = multiple line comments

        //3.3 Data Types
        //3.3.1 Integer Types
        int a = 45;
        short b = 23;
        long c = 12345;
        byte e = 1;
        //3.3.2 Floating Point
        double f = 45.678;
        float g = 45f;
        //3.3.3 char Type
        char h = 'a';
        //3.3.4 UniCode
        //3.3.5 The Boolean Type
        boolean i = true;

        //3.4 Variables
        // the name of the type
        int myNumber = 12;
        double salary = 33.44;

        //3.4.2 Constants
        final int myInt = 333;
        // the word final indicates that you can assign to a variable once

        //3.5 Operators
        double po = 32;
        double yo = 34;
        System.out.println(po + yo);
        System.out.println(po - yo);
        System.out.println(po / yo);
        System.out.println(po * yo);
        System.out.println(Math.pow(po,yo));

        //3.6 Strings
        String r = ""; //an empty string
        String greeting = "Hello";

        //sub string
        String s =greeting.substring(0,3);
        System.out.println(s);

        //concatentaion
        String explosive = "BOOM!";
        String bang = "BOOM";
        String message = explosive + bang;

        System.out.println(message);

        //Testing Strings for Equality
        "BOOM".equals(explosive);
        "BOOM".equalsIgnoreCase("boom");

        //if empty
        if(bang.equals(""));

        //String Builder
        // to build on top of multiple strings
        StringBuilder builder = new StringBuilder("Hello World");

        //can call apon multiple strings or characters by using
        builder.append('H');
        builder.append("World");

        //to complete the sentence/ build
        String completedString = builder.toString();









    }
}
