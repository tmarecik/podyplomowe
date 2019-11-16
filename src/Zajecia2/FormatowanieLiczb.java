package Zajecia2;

public class FormatowanieLiczb {
    public static void main(String[] args) {

        int accountBalance = 15005;
        System.out.println(accountBalance);
        System.out.printf("Saldo: %,d zł%n", accountBalance);

        //s - formatowanie stringow
        //d - liczby całkowite
        //f - floating point
        //t - data czas
        //n - separator lini
        //bB - boolean

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("%.11f%n", pi);



    }
}




