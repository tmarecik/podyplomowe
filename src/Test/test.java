package Test;

public class test {
    public static void main(String[] args) {


        A a  = new A();
        A a2 = new A("test");
        B b2 = new B("testujemy");
        B b = new B(); //tutaj niejawnie wywoływany jest kostruktor z klasy nadrznędnej  (parametr super!)



    }

}


class A {

    A (){
        System.out.println("dziala kont A");
    }

    A (String param){
        System.out.println("Działa konst A z parametram: " + param);
    }

    void show(){
        System.out.println("A");

    }
}

class B extends A{

    B (){
        System.out.println("dziala kont B");
    }

    B (String param) {
        super(param);   // wywołuje kostruktor z klasy nadrzędnej
        System.out.println("Działa konst A z parametram: "  + param);
    }

        void show(){
        System.out.println("B");

    }

}
