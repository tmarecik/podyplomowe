package Test;

public class Sklep {

    public static void main(String[] args) {

        Product milk1 = new Product("Mleko", 2.78);
        Product milk2 = new Product("Mleko", 2.78);

        System.out.println(milk1 == milk2);
        System.out.println(milk1.equals(milk2)); //to wymagało dodatkowego zaimplementowania - nadpisania metody equals

    }

}
