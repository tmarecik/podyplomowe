package Labortorium5;

public class LiczenieBitow {

    public static void main(String[] args) {

        int i = 123;
        int n = 2;
        int maska = 1 << n;

        boolean result = (i & maska) > 0;

        System.out.println("Dal licznby " + i + " na pozycji " + n + " znajduje sie bit " + result);
        System.out.println(String.format("%32s", Integer.toBinaryString(i).replace(' ','0')));
        System.out.println(String.format("%32s", Integer.toBinaryString(maska).replace(' ','0')));
    }

}
