package laboratorium16;

import org.w3c.dom.ls.LSOutput;
import pl.edu.wszib.jwe.DataProvider;

import java.util.Scanner;

public class Sqrt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe nieujemna: ");
        Double d = Double.parseDouble(scanner.nextLine());

        if(d < 0){
            throw new IllegalArgumentException();
        }
        System.out.println(Math.sqrt(d));
    }

}
