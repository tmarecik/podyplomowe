package Labortorium5;

public class DzielenieBezReszty {

    int liczba;

    DzielenieBezReszty(int liczba){
        this.liczba = liczba;
        dzielenie(this.liczba);
    }

    public static void dzielenie(int liczba){
        if ((liczba%5 == 0) && (liczba%7 == 0)){
            System.out.println("liczba: " + liczba + " jest podzielna przez 5 i 7"); }
        else {
            System.out.println("liczba: " + liczba + " nie jest podzielna przez 5 i 7"); }
    }

    public static void main(String[] args) {
        DzielenieBezReszty dzielenie = new DzielenieBezReszty(30);
        dzielenie (35);
    }


}
