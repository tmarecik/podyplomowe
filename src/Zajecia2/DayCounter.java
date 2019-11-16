package Zajecia2;

public class DayCounter {
    public static void main(String[] args) {    //args jest zmienna tablicowa

     int yearIn = 2016;
     int mounthIn = 1;

     if (args.length > 0 ){
        mounthIn = Integer.parseInt(args[0]);  //Integer.parseInt - sparsuje str na integera
     }

     if (args.length > 1){
         yearIn = Integer.parseInt(args[1]);
     }
        System.out.print( mounthIn + "/" + yearIn);
        System.out.println(" ma " + countDays(mounthIn, yearIn) + "dni.");
    }

    static int countDays(int mount, int year){
        int count = -1;
        switch (mount){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:
                if (year % 4 == 0){
                    count = 29;
                } else {
                    count =28;
                }

                if ((year % 100 == 0 ) && (year % 400 != 0)){
                    count = 28;
                }
        }
    return count;
    }
}
