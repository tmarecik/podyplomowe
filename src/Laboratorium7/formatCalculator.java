package Laboratorium7;

import javax.swing.*;

public class formatCalculator {
    public static void main(String[] args) {

            String bitnumber = "101";
            int maximumPower = bitnumber.length();
            int start =0;
            int end = 1;

            double wynik = 0;

        for(int i = 3; i > 0; i--){

                int skladniki = Integer.parseInt(bitnumber.substring(start, end));
//                System.out.println(skladniki);
//            System.out.println("i: " + i);
                double skladnikDoPotegi;
                skladnikDoPotegi = Math.pow(skladniki, maximumPower);
            System.out.println(skladnikDoPotegi);

//            maximumPower--;
            start++;
            end++;

            wynik = wynik + skladnikDoPotegi;
//
//
            System.out.println(wynik);
        }

    }


}
