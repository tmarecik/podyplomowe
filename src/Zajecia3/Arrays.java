package Zajecia3;

import java.awt.*;

public class Arrays {
    public static void main(String[] args) {

        Point[] markups = {new Point(1,1), new Point(2,3), new Point(5,5)};
        System.out.println(markups[2].x);
        markups[2].x = 555;
        System.out.println(markups[2].x);
        Point p = markups[2]; //przekazujemy referencje 3 elementu tablicy markups do zmiennej p
        p.x = 222;
        System.out.println(markups[2].x); //tutaj wyswieli sie 222


        int[][] multiDimArr = {{1,2},{3,4}}; //tablica wielowymiarowa (dwu)
        int[] a = {1,2};
        int[] b = {3,4,5,6};
        int[][] c = new int[2][];  // tożsame z int[][]c = {a,b}
        c[0] = a;
        c[1] = b;
        System.out.println("rozmiar tablicy wewnetrzrnej pierwszej: " + c[0].length );
        System.out.println("rozmiar tablicy wewnetrzrnej drugiej: " + c[1].length );
        System.out.println("-------------------------------------------");

        String[] titles = new String[5];

        titles[0] = "Pan";
        titles[1] = "Pani";
        titles[2] = "Państwo";
        titles[3] = "Panna";
        titles[4] = "Doktor";

        //iterowanie po tablicach

        int[] numbers = {1,2,3,4,5};

        for(int i=0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("----------enhacement for-------------- ");

        for (int x: numbers) {
            System.out.println(x);
        }

        String[] dogs = {"Burek", "Reksio", "Ciapek"};
        String[] people = {"Ala", "Ola", "Ela"};
        String[] cats = {"Filemon", "Mruczek", "Bonifacy"};
        String[][] names = {dogs, people, cats};

        for (int i = 0; i < names.length; i++){
            for (int j = 0; j < names[i].length; j++){
                System.out.print(names[i][j] + " ");
            }
            System.out.println();

        }


    }
}




