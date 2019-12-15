package modifiers;

public class WashingMachine {

    private int temperature;
    private int spinning;

    void modeForSensitiveCloads(){
        this.temperature = 30;
        this.spinning = 800;
    }

    public void modeTowelsAndBedLinen(){
        this.temperature = 90;
        this.spinning = 1200;
    }

    public void showSettings() {
        System.out.println("Temperatura: " + this.temperature + ", obroty: " + this.spinning);
    }

    public static void main(String[] args) {

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.modeForSensitiveCloads();
        washingMachine.showSettings();

        washingMachine.modeTowelsAndBedLinen();
        washingMachine.showSettings();
    }

}
