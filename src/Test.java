import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {

        int x = 0;
        {                 //zefiniowany sztuczny blok ale zmienne w srodku sa lokoalne
            int y = 7;
            y = y + x;
        }
        //System.out.println(y);   // to nine zadziała
        //-----------------------------------------

        if (x > 0){
            System.out.println("X wieksze od zera");
        } else if (x < 0){
            System.out.println("X mniejsze od zera");
        } else {
            System.out.println("X równe zera");
        }


        char grade = 'D';

        switch (grade){
            case 'A':
                System.out.println("Wspaniale");
                break;   //jezeli braknie break wykonane zostana kolejne case'y
            case 'B':
                System.out.println("Dobrze");
                break;
            case 'C':
                System.out.println("Mogło być lepiej");
                break;
            default:
                System.out.println("Rozważ oszukiwanie :D");
        }

        System.out.println("tests tests tests tests from home");
        System.out.println("tests tests tests tests from home");
        System.out.println("tests tests tests tests from home");

    }
}




