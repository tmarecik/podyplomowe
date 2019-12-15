package modifiers;

public class TestObject {

    public static void main(String[] args) {

        for (int i = 1; i < 500; i ++ ){
            new InstanceNumber();
            InstanceNumber.setNumberInstances(i);
        }

        System.out.println("utworzono obiektów: " + InstanceNumber.getNumberInstances());

    }

}
