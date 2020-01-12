package farm;

abstract public class Animal {

    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = "bezimienne";
    }

    String showName(){
        return "zwierzę: " + name ;
    }

    String makeSound(){
        return "????";
    }

    void introduce(){
        System.out.println("Jestem: " + showName() + ": " + makeSound());
    }

}
