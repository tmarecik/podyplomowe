public class MarsRobot implements Robot{

    String status;
    int speed;
    float temperature;

    public void checkTemperature(){
        if (temperature < -80){
            status = "powrót do domu";
            speed = 5;
        }
    }

    public void checkStatus(){
        System.out.println("Status: " + status);

    }

    void showAttributes(){
        this.checkStatus();
//        System.out.println("status: " + status);
        System.out.println("speed: " + speed);
        System.out.println("temperature: " + temperature);
    }

}
