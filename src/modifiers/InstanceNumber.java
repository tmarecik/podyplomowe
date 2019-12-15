package modifiers;

public class InstanceNumber {

    private static int numberInstances;  //musi byc dostepne z zewnatrz "static" -> bo liczymy ilosc obiektow w całym pakiecie

    public InstanceNumber() {
        numberInstances ++;
    }

    public static int getNumberInstances() {
        return numberInstances;
    }

    public static void setNumberInstances(int numberInstances) {
        InstanceNumber.numberInstances = numberInstances;
    }

}
