package Laboratorium9;

public class Passer {

    void toUpperCase(String[] strings) {

        for(int i =0; i < strings.length; i++ ){
            strings[i] = strings[i].toUpperCase();
        }
    }

    public static void main(String[] args) {

        Passer passer = new Passer();
        passer.toUpperCase(args);
        for (String string : args){
            System.out.println(string);
            System.out.println(" ");
        }
        System.out.println();

    }


}
