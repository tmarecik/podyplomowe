package Laboratorium9;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;

public class FourDimPoint extends Point {
    int z;
    int t;

    public static FourDimPoint create(int x, int y, int z, int t){

        FourDimPoint fourP = new FourDimPoint();
        fourP.x = x;
        fourP.y = y;
        fourP.z = z;
        fourP.t = t;
        return fourP;
    }

    void show(){
        System.out.println("x: " + this.x);
        System.out.println("y: " + this.y);
        System.out.println("z: " + this.z);
        System.out.println("t: " + this.t);
    }

    public static void main(String[] args) {
        FourDimPoint.create(1,1,1,1).show();
    }

}
