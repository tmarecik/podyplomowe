package Test;

import java.awt.*;

public class test1 {
    public static void main(String[] args) {
        Integer i = 1;
        System.out.println(i);

        Point point = new Point(3,4);
        System.out.println(point.toString());

        Emploi emploee1 = new Emploi("Kowalsky", 34, 4500);
        Emploi emploee2 = new Emploi("Kowalsky", 21, 2500);
        Emploi emploee3 = new Emploi("Kowalsky", 34, 4500);

        System.out.println(emploee2.toString());
        System.out.println(emploee1.equals(emploee2));
        System.out.println(emploee1.equals(emploee3));




    }


}
