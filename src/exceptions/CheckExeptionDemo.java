package exceptions;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class CheckExeptionDemo {

    public static void main(String[] args) throws MalformedURLException {

        CheckExeptionDemo ced = new CheckExeptionDemo();
//        ced.urlTesterByTryCatch("http//wszib.edu.pl");
//        ced.urlTesterByTryCatch("ssss//wszib.edu.pl");
        ced.urlTesterByTryCatch("ssss//wszib.edu.pl");
        ced.urlTesterByThrows("ssss//wszib.edu.pl");
//        ced.urlTesterByTryCatch("https://wszib.edu.pl");
    }

    public void urlTesterByTryCatch(String urlStr){
        try {
            URL url = new URL(urlStr);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        } catch (MalformedURLException e) {
            System.out.println("Błąd: " + e.getMessage());
//            e.printStackTrace();
        }
    }

    public void urlTesterByThrows(String urlStr) throws MalformedURLException {
        URL url = new URL(urlStr);
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
    }


}
