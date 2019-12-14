package Laboratorium10;

public class Boy extends Human{

    void eat(){
        System.out.println("Jestem głodny, poprosze cos do jedzenia");
    }

    public static void main(String[] args) {
        Boy Kuba = new Boy();
        Kuba.eat();

        Human troglodyta = new Human();
        troglodyta.eat();

    }

}
