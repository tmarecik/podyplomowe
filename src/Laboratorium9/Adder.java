package Laboratorium9;

public class Adder {

    public static void main(String[] args) {
        System.out.println(Adder.sum(1,2));
        System.out.println(Adder.sum(1, 2, 3));
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){    //dało sie tak zrobic (dodac ponownie metode sun) poniewaz zmienła sie sygntura funkcji
        return a + b + c;
    }
}
