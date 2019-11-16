package Zajecia2;

public class RzutowanieObiektow1 {
    public static void main(String[] args) {

        Employee employee = new Employee();
        VicePresident vp = new VicePresident();

        employee = vp;  //tak wolno nie tracimy precyzji (vp posiada wszystkie metody employee)
        //vp = employee;  // employe nie moze posiadac mniej metod niz vp
        vp = (VicePresident)employee; // jezeli wiemy co robimy to mozna przepchnac za pomoca rzutowania

    }
}


class Employee{};

class VicePresident extends Employee {};



