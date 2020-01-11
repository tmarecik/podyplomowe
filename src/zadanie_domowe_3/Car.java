package zadanie_domowe_3;

import java.util.Random;

public class Car {
    String modelName;
    String color;
    int production_yeare;
    private Random rand = new Random();

    public Car() {
        this.modelName = getRandomCarModel();
        this.color = getRandomColor();
        this.production_yeare = getRandomProductionYear();
    }

    private String getRandomCarModel(){
        String [] model_name_table = {"Yaris", "Corolla", "Aygo"};
        return model_name_table[rand.nextInt(model_name_table.length)];
    }

    private String getRandomColor(){
        String [] color_table = {"Silver", "Blue", "Black"};
        return color_table[rand.nextInt(color_table.length)];
    }

    private int getRandomProductionYear(){
        int [] production_yeare_table = {2018, 2019, 2020};
        return production_yeare_table[rand.nextInt(production_yeare_table.length)];
    }

    public void displayCarData(){
        System.out.print("Model name: " + modelName);
        System.out.print(" Color: "+ color);
        System.out.println(" Yeare of production: " + production_yeare);
    }
}
