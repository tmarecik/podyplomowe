package enums;

public enum Formatter {

    CALM{                          //tu morzemy stworzyc metody!!
        public String format(String message){
            return "Wiadomość: " + message;
        }
    },

    NERVOUS{
        public String format(String message){
            return "Stop! Uwaga! Wiadomość: " + message + " !!!";
        }
    };

    public abstract  String format(String message);   // tu jest deklaracja metody abstrakcyjnej a przy poszczegolnych parametrach  jest jej deklaracja

}
