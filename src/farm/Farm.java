package farm;

public class Farm {
    public static void main(String[] args) {

        Animal[] animals = new Animal[5];
        animals[0] = new Dog("Burek");
        animals[1] = new Cat("Filemon");
        animals[2] = new Pig("Prosiaczek");
        animals[3] = new Dog("Azzor");
        animals[4] = new Dog("Morus");

        for(Animal animal: animals){
            animal.introduce();
        }

    }
}

