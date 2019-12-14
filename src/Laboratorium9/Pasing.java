package Laboratorium9;

import java.awt.*;

public class Pasing {

    public static void main(String[] args) {
        int i = 10;
        System.out.println("przed zmianą i = " + i);
        changIt(i);
        System.out.println("po zmianie i = " + i);

        Point p = new Point(1,1);
        System.out.println("Przed zmianą: " + p );
        changIt(p);
        System.out.println("Po zmianie: " + p );

    }

    static void changIt(int i){
        System.out.println("Zmieniam i..." );
        i++;
        System.out.println("Lokalne i: " + i);
    }
    static void changIt(Point p){
        p = new Point(4,4);  // tutaj został stworzony nowy obiekt który ma inny adres w pamieci
        System.out.println("zmieniam p");
        p.x++;
        p.y++;
    }

}
