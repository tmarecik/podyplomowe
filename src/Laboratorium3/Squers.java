package Laboratorium3;

public class Squers implements FigureAttributes {

    double squer_side;

        public Squers(double squer_side){
            this.squer_side = squer_side;
        }

    public void area() {
        System.out.println("squer area: " + (Math.pow(squer_side, 2)));
    }

    public void perimeter() {
        System.out.println("squer perimeter: " + (squer_side * 4));
    }

    public void diagonal() {
        System.out.println("squer diagonal: " + (Math.sqrt(2) * squer_side));
    }

    public void getAttributs(){
            System.out.println("Squer with side equal: " + squer_side);
            area();
            perimeter();
            diagonal();
            System.out.println("----------------------------------------");

    }

    public static void main(String[] args) {
        Squers kwadrat_2 = new Squers(2);
        kwadrat_2.getAttributs();

        Squers kwadrat_7 = new Squers(7);
        kwadrat_7.getAttributs();

        Squers kwadrat_11 = new Squers(11);
        kwadrat_11.getAttributs();

        Squers kwadrat_19 = new Squers(19);
        kwadrat_19.getAttributs();

    }

}
