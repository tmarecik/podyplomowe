package Zajecia2;

import java.awt.*;

public class PointSetter {
    public static void main(String[] args) {

     Point location = new Point(4,13);
     Point point;

        System.out.println("położenie początkowe: ");
        System.out.println("x: " + location.x);
        System.out.println("y: " + location.y);

        System.out.println("Przejscie do punktu (7,6)\n");
        location.x = 7;
        location.y = 6;

        point = location;  //od tej pory point wskazuje na obiekt location  !! uwaga zmienne lokalne musza być zainicjalizowane

        point.x = 0;
        point.y = 0;

        System.out.println("Położenie końcowe");
        System.out.println("x: " + location.x);
        System.out.println("y: " + location.y);

        location = null;
        point = null;

        //GC - garbage coillector -> teraz zacznie sprzątać obiekt Point

    }
}
