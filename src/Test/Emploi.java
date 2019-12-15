package Test;

import java.util.Objects;

public class Emploi {
    String name;
    int age;
    int salary;

    public Emploi(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emploi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emploi emploi = (Emploi) o;
        return
                age == emploi.age &&
                salary == emploi.salary &&            // to my decydujemy które pola-> atrybuty są porównywalne
                Objects.equals(name, emploi.name);
    }

}
