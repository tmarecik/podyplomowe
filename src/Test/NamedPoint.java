package Test;

import java.awt.*;

public class NamedPoint extends Point {

    String name;

    public NamedPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    void show(){
        System.out.println(name + "(" + x + "," + y + ")" );
    }

    public static void main(String[] args) {

        NamedPoint np = new NamedPoint(5, 5, "A");
        System.out.println("X wynosi " + np.x);
        System.out.println("Y wynosi " + np.y);
        System.out.println("Point Name " + np.name);

        np.show();

    }
}
