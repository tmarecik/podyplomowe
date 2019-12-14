package Laboratorium11;

public class Klasy {

    public static void main(String[] args) {

//        A a = new A();
//        System.out.println("-------------------");
//
//        B b = new B();
//        System.out.println("-------------------");
//
//        C c = new C();
//        System.out.println("-------------------");
//
//        System.out.println("wywołanie funkcji z parametrem true");
//
//        A a1 = new A(true);
//        System.out.println("-------------------");
//
//        B b1 = new B(true);
//        System.out.println("-------------------");
//
//        C c1 = new C(true);
//        System.out.println("-------------------");
//
//        System.out.println("wywołanie funkcji z parametrem false");
//
//        A a2 = new A(false);
//        System.out.println("-------------------");
//
//        B b2 = new B(false);
//        System.out.println("-------------------");
//
//        C c3 = new C(false);
//        System.out.println("-------------------");
    new A(false);
    }

}

class A {
    A () {
        System.out.println("Działa konstruktor A");
    }
    A(boolean param){
        if (param==true){
        } else if (param == false){
            System.out.println("Działa konstruktor A");
        }
    }
}


class B extends A{
    B () {
        System.out.println("Działa konstruktor B");
    }
    B(boolean param){
        super(true);
        if (param == false) {
            System.out.println("Działa konstruktor B");
        }
    }

}

class C extends B1 {

    C () {
        System.out.println("Działa konstruktor C");
    }
    C(boolean param){
        super(true);
        if (param == false) {
            System.out.println("Działa konstruktor C");
        }
    }
}