package laboratorium14;

public class Cat extends Animal {

    private static int instanceNumber = 0;
    private String animalType = "cat";

    Cat() {
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
