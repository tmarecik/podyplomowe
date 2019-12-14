package Laboratorium9;

public class PriceFormater {
//    klasa narzedziwa do formatowania ceny w sklepie internetowym

    String currency = "zł";

    String formatPrice(int value ){
        return String.format("%d,00 %s", value, currency);
    }

    String formatPrice(double value ){
        return String.format("%.2f %s", value, currency);
    }

    String formatPrice(String value ){
        return String.format("%.2f %s", Double.parseDouble(value), currency);
    }

//    String formatPrice(Double value ){
//        return String.format("%.2f %s", value, currency);
//    }


    public static void main(String[] args) {
        PriceFormater pf = new PriceFormater();
        pf.currency = "$";
        System.out.println(pf.formatPrice(7));
        System.out.println(pf.formatPrice(12.345678));
        System.out.println(pf.formatPrice("3.78"));
    }
}
