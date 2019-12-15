package modifiers;

public class WashingMachineApp {

    public static void main(String[] args) {

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.modeForSensitiveCloads();
        washingMachine.showSettings();

        washingMachine.modeTowelsAndBedLinen();
        washingMachine.showSettings();
        

    }


}
