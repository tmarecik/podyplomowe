package Laboratorium8;

public class digitsInArray_finished {
    public static void main(String[] args) {

        int[] arr= {8, 1, 1, 9, 2, 3, 9, 9, 1, 2, 4, 9, 3, 11,11,11,11,11,11,11,11,11};
        int tablicaElementow[] = new int[arr.length];
        int tablicaWystapien[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++){

                int index = 0;
                for(int j = 0; j < arr.length; j++){
                   if(arr[i] == arr[j]){
                        index++;
                    }
                }
            tablicaWystapien[i] = index;
        }


        int maxValue = tablicaWystapien[0];
        int indexOfMaxValue = 0;

        for(int i = 0; i < tablicaWystapien.length-2; i++){

            if(tablicaWystapien[i] < tablicaWystapien[i+1]){
                maxValue = tablicaWystapien[i+1];
                indexOfMaxValue = i+1;

            }
        }
        System.out.println("most offtem digit: " + arr[indexOfMaxValue]);





    }
}
