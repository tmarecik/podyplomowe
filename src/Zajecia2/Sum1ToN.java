package Zajecia2;

import java.util.Scanner;

public class Sum1ToN {
    public static void main(String[] args) {
        System.out.println("n = ");

        Scanner scanner = new Scanner(System.in);  // input z klawiatury
        int n = scanner.nextInt();  //spodziewamy sie dostac od uzytkownika zmienna typu int
        int numbe = 1;
        int sum = 1;
        System.out.print("Suma 1");

        while (numbe < n){
            numbe++;
            sum += numbe;
            System.out.print(" + " + numbe);

        }
        System.out.print(" = " + sum);


    }


}
