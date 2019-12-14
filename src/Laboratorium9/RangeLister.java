package Laboratorium9;

public class RangeLister {

//    int tablicaElementow[] = new int[arr.length];

    int[] makeRange ( int start, int end) {
        int range[] = new int[(end + 1) - start];

         for(int i = 0; i < range.length; i ++){
             range[i] = start ++;
         }
        return range;
    }

    void showRange(int[] range) {

        System.out.print("Tablica: [");
        for(int i = 0; i < range.length; i++ ){
            System.out.print(range[i] + ",");
        }
        System.out.println("]");

    }

    public static void main(String[] args) {
        int[] range;

        RangeLister rangeLister = new RangeLister();
        range = rangeLister.makeRange(5, 7);
        rangeLister.showRange(range);
    }

}
