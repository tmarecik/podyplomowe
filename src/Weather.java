public class Weather {

    public static void main(String[] args) {

        float fah = 86;

        System.out.println(fah + " stopni Farenheita to ... ");

        fah = fah -32;
        fah = fah / 9;
        fah = fah * 5;
        System.out.println( fah + "stopni Celsiusza \n");

        float cel = 33;
        System.out.println(cel + " stopni Celsiusza to ... ");
        cel = cel * 9;
        cel /= 5;
        cel += 32;
        System.out.println( cel + "stopni Farenheita \n");


    }

}
