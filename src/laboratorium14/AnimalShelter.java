package laboratorium14;

import java.util.Random;


public class AnimalShelter {

    public static void main(String[] args) {

        Animal[] cage = new Animal [100];

        for(int i = 0; i < 100; i++){

            Random random = new Random();
            int j = random.nextInt(3);

            if(j == 0){
                cage[i] = new Dog();
            } else if (j == 1) {
                cage[i] = new Cat();
            } else {
                cage[i] = new Giraffe();
            }
        }

        System.out.println("animal type in cage 33: " + cage[33].getType());
        System.out.println("class instancess: " + cage[33].getType() + "number: " + cage[33].getInstanceNumber());

    }
}
