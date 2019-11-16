package Labortorium5;

public class Inwestycja {

    public static void main(String[] args) {

        double invest = 14000;
        double firsYear = (invest * 0.40) + invest;
        double secondYear = firsYear - 1500;
        double thirdYear = secondYear * 0.12 + secondYear;

        System.out.println("wartość investycji start: " + invest + " zł");
        System.out.println("wartość investycji po pierwszum roku: " + firsYear + " zł");
        System.out.println("wartość investycji po drugim roku: " + secondYear + " zł");
        System.out.println("wartość investycji po trzecim roku: " + thirdYear + " zł");

    }

}
