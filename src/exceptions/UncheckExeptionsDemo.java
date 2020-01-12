package exceptions;

public class UncheckExeptionsDemo {

    public static void main(String[] args) {

        UncheckExeptionsDemo ued = new UncheckExeptionsDemo();
        int i = ued.getNumberFormatString("12");
        if (i != -1) {
            System.out.println(" To nasza liczba pomno zuna przez 5 ->: " + i * 5);
        }
    }

    public int getNumberFormatString(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException nfe){
            System.out.println("Coś poszło nie tak! Upewnij się że przekazywany string jest liczbą!");
        }
        return -1;
    }
}

