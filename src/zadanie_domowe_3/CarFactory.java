package zadanie_domowe_3;

public class CarFactory {

    Parking motomachi = new Parking(5000, "Motomachi");
    Parking tsutsumi = new Parking(4500, "Tsutsumi");
    Parking tahara = new Parking(1700, "Tahara");

    String[] carColourInProduction = {"Silver", "Blue", "Black"};

    void createCars(){
        carProduction(motomachi);
        carProduction(tsutsumi);
        carProduction(tahara);
    }

    void carProduction(Parking parking){
        while(parking.isFree){
            parking.appendCar(new Car());
        }
    }

    int motomachiSilverYaris2020(){
        int numberOfSilverYaris2020 =0;
        for(int i =0; i < motomachi.parking.length-1; i++){
            if( (motomachi.parking[i].modelName.equals("Yaris")) && (motomachi.parking[i].color.equals("Silver")) && (motomachi.parking[i].production_yeare == 2020)){
                numberOfSilverYaris2020++;
            }
        }
        return numberOfSilverYaris2020;
    }

    void taharaFirstTenCars(){
        for(int i =0; i < 10; i++){
            tahara.parking[i].displayCarData();
        }
    }

    private void colorCarOccurrence(Parking parkingName){
        int[] colorTable = new int[3];
        for(int i = 0; i < parkingName.parking.length; i++ ){
            if(parkingName.parking[i].color =="Silver"){
                colorTable[0]++;
            } else if(parkingName.parking[i].color =="Blue"){
                colorTable[1]++;
            } else /*color Balck*/ {
                colorTable[2]++;
            }
        }

        System.out.println("Number of car in particular color in " + parkingName.factoryName + " factory");
        System.out.println("Silver " + colorTable[0]);
        System.out.println("Blue " + colorTable[1]);
        System.out.println("Black " + colorTable[2]);

        System.out.println("Most offtem Car color in " + parkingName.factoryName + " Factory: "+ this.carColourInProduction[this.maxValu(colorTable)[1]]);
    }

    int[] maxValu(int[] list){
        int max=list[0];
        int colorIndex = 0;
        for(int i = 1; i< list.length; i++){
            if(list[i] > max){
                max=list[i];
                colorIndex = i;
            }
        }
        return new int[] {max, colorIndex};
    }

    void tsutsumiColorCarOccurrence(){
        this.colorCarOccurrence(tsutsumi);
    }

    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();
        carFactory.createCars();

        System.out.println("----------------------------");
        System.out.println("Number of silver Yaris from year 2020 in " + carFactory.motomachi.factoryName + " : " + carFactory.motomachiSilverYaris2020());
        System.out.println("----------------------------");
        carFactory.tsutsumiColorCarOccurrence();

        System.out.println("----------------------------");
        System.out.println(" Tahara first ten Cars information: ");
        carFactory.taharaFirstTenCars();









    }

}
