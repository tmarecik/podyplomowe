package Laboratorium7;

import java.util.Scanner;

public class Macierze {

    public static void main(String[] args) {

        System.out.println("Podaj wymiar macerzy dla 0<n<30; n  = ");
        Scanner scanner = new Scanner(System.in);
        int wymiarMacierzy = scanner.nextInt();

        if((wymiarMacierzy <= 30) && (wymiarMacierzy > 0)){

            System.out.println("n = " + wymiarMacierzy);
            System.out.println("----------------");

            int wileIncerement = 1;
            int wartoscStartowa = 1;

            while(wileIncerement <= wymiarMacierzy) {
                int wartoscMacierzy = wartoscStartowa;

                for (int i = 1; i <= wymiarMacierzy; i++) {
                    System.out.print(" " + wartoscMacierzy);
                    wartoscMacierzy++;
                }

                wartoscStartowa++;
                wileIncerement++;
                System.out.println("\n");
            }
        }  else {
            System.out.println(" n jest z poza poprawnego zakresu");
        }

    }
}
