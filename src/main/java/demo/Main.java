package demo;

import shape.MyCircle;
import shape.MySquare;
import shape.MyTriangle;

public class Main {


    public static void main(String[] args) {

        Artist me = new Artist();
        me.setFirstName("Avonte");
        me.setLastName("Cannon");
        me.getFirstName();
        me.getLastName();
        me.getSongName();
        System.out.println(me.nameMySongs("Holla Back Girl ", " Hello WOrld ", " IDK ", " I Want to Go Home "));







    }
}
