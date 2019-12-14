package Laboratorium9;

public class Vars {

    int i; //zmiernna egzemplaza (pole, pole klasy)
    static int j = 2;  //zmienna statyczne (zmienna klasowa = pole ststyczne)

    public int change(){

        int k = 7;  //zmienne lokalne muszą buć inicjowane, nie są inicjowane domyślnie
        return i + (k + j);
    }

    public static void main(String[] args) {
        int i = 77;  // ta zmienna lokalna jest widocz tylko w zasięgu { i } wewnątrz metody main

        Vars v = new Vars(); //nie tylko
        v.i = 9;
        System.out.println("wyswietlamy zmienna egzemplaza dla v: " + v.i);

        Vars vv = new Vars();
        vv.i = 5;
        System.out.println("wyswietlamy zmienna egzemplaza dla vv: " + vv.i);

        System.out.println("wyswietlamy zmienna klasowa: " + j);
        System.out.println("wyswietlamy zmienna lokalna: " + i);

    }



}
