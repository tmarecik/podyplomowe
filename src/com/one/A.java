package com.one;

public class A {

    public int number;
//    String name; //"name" bez modyfikatora posiada dostęp defoultowy -> pakietowy, pakiet B nie ma do tego dotępu
    protected String name; //teraz pakiet B ma dostęp  do tego pola poprzez dziedziczenie
}
