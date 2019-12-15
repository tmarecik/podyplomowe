import java.awt.*;
import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {


        int[] counter = new int[4];

        counter[0]++;
        counter[0]++;
        counter[0]++;
        counter[1]++;
        counter[1]++;
        counter[1]++;
        counter[1]++;
        counter[1]++;
        counter[2]++;
        counter[2]++;
        counter[3]++;
        counter[0]++;

        for(int i = 0 ; i < counter.length; i++){
            System.out.println(i + " -> " + counter[i]);
        }

    }
}




