package laboratorium14;

public class Dog extends Animal {

    private static int instanceNumber = 0;
    private String animalType = "dog";

    Dog() {
        instanceNumber++;

    }

    @Override
    public String getType() {
        return this.animalType;
    }

    @Override
    public int getInstanceNumber() {
        return instanceNumber;
    }
}
