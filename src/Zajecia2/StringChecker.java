package Zajecia2;

public class StringChecker {
    public static void main(String[] args) {

        String str = "Lannister zawsze spłaca swoje długi.";

        System.out.println("nasz tekst to: " + str);
        System.out.println("długość tekstu: " + str.length());
        System.out.println("Zank na pozycji 6: " + str.charAt(6));
        System.out.println("Fragmeny od znak 10 do znaku 16: " + str.substring(10, 16));
        System.out.println("Indeks pierwszej litery 't': " + str.indexOf('t'));
        System.out.println("Indeks początku podtekstu \"długi\": " + str.indexOf("długi"));
        System.out.println("Tekas zapisany wielkimi literami: : " + str.toUpperCase());


    }

}
