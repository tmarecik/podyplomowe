public class MarsApplication {

    public static void main(String[] args) {

        MarsRobot spirit = new MarsRobot();
        spirit.status = "exploracja";
        spirit.speed = 2;
        spirit.temperature = -60;
        spirit.showAttributes();

        System.out.println("-------------------------");
        System.out.println("zwikszenie predkosci do 3");
        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println("-------------------------");
        System.out.println("zmiana temperatury na -90");
        spirit.temperature = -90;
        spirit.showAttributes();

        System.out.println("-------------------------");
        System.out.println("sprawdzenie temperatury");
        spirit.checkTemperature();
        spirit.checkStatus();


        System.out.println("-------------------------");
        System.out.println("robot oportunity wysłany do akcji");

        MarsRobot oportunity = new MarsRobot();
        oportunity.status = "exploracja";
        oportunity.speed = 1;
        oportunity.temperature = -30;
        oportunity.showAttributes();

        System.out.println("--------------------------");
        System.out.println("oportunity check status:");
        oportunity.checkStatus();

        System.out.println("spirit check status:");
        spirit.checkStatus();

    }

}
