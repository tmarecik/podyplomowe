package farm;

public class Dog extends Animal{
    public Dog(String name) {
        this.name = name;
    }


    String showName() {
        return "pies " + name;
    }

    @Override
    String makeSound() {
        return "hau hau";
    }
}
