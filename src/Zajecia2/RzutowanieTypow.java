package Zajecia2;

public class RzutowanieTypow {
    public static void main(String[] args) {

        byte a = 7;
        short b;
        int c;

        c = a; // nie zachodzi tutaj utrata precyzji (niejawna konwersja)
        //b = c; // tak nie zadziala bo int nie zmiesci sie w short
        b = (short)c;  // tak zmuszamy kompilator do działania //rzutowanie

        int x = 5;
        double y = 13.5;
        //double z = x / y; // tak zadziała
        int z = (int)(x / y);  // tutaj tracimy precyzje - ułamki //rzutowaniem możemy go do tego zmusić
        int z1 = x / (int)(y);


    }
}




