package Zajecia2;

import java.math.BigInteger;

public class ForLoop {
    public static void main(String[] args) {

//        for(int i =0; i< 10; i++){
//            System.out.printf("%d", i);
//        }
//        System.out.println();

        int number = 5;   // silnia(5) 1 * 2 * 3 * 4 * 5
        BigInteger factorial = BigInteger.ONE;

        for(int i=1; i <= number; i++ ){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("%d! = %s%n", number, factorial );
    }

    int i = 0;

//    do {
//        System.out.println(i);
//    } while(i < 100) {
//        i++;
//    }
//
}
