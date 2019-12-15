package laboratorium14;

public class Giraffe extends Animal {

    private static int instanceNumber = 0;
    private String animalType = "giraffe";

    Giraffe() {
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
