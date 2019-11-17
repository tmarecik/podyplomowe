package Laboratorium8;

public class MultidimensionalArray {
    public static void main(String[] args) {


    int[][][] arr = {{{5},{6},{1}}};

    for(int i = 0; i < arr.length; i++){
        for(int j=0; j < arr.length; j++){
            for (int k=0; k < arr.length; k++){
                System.out.println(arr[i][j][k]);
            }
        }

    }



    }
}
