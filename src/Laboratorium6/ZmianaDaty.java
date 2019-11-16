package Laboratorium6;

import java.util.StringTokenizer;

public class ZmianaDaty {
    public static void main(String[] args) {

        String DataUrodzenia = "29/04/2016";
        StringTokenizer date1 = new StringTokenizer(DataUrodzenia, "/");;

        String Dzien = date1.nextToken();
        String Miesiac = date1.nextToken();
        String Rok = date1.nextToken();

        System.out.println("dzień: " + Dzien);
        System.out.println("miesiąc: " + Miesiac);
        System.out.println("rok: " + Rok);

        //String Dzien = date1.nextToken(DataUrodzenia);



    }


}
