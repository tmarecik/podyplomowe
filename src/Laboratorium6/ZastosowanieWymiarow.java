package Laboratorium6;

public class ZastosowanieWymiarow {
    public static void main(String[] args) {
        Wymiary TestowaneWymiary = new Wymiary(10,11,12);

        System.out.println("oryginalny depth: " + TestowaneWymiary.depth);
        System.out.println("oryginalny wide: " + TestowaneWymiary.wide);
        System.out.println("oryginalny heigh: " + TestowaneWymiary.height);

        System.out.println("\nmodyfikuje obiekt klasa\n");

        TestowaneWymiary.depth = 213;
        TestowaneWymiary.wide = 24;
        TestowaneWymiary.height =813;

        System.out.println("wymiary po modyfikacji -> depth: " + TestowaneWymiary.depth);
        System.out.println("wymiary po modyfikacji -> oryginalny wide: " + TestowaneWymiary.wide);
        System.out.println("wymiary po modyfikacji -> oryginalny heigh: " + TestowaneWymiary.height);

    }
}
