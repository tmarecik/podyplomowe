package Test;

public class MarsRobot {

    String status;
    int speed;
    int power;

    MarsRobot() {}   //kostrukxtor bezargumentowy -> domyśly dzięki temu możemy inicjalizoać obiekt bez argumentów / nie zawsze poytrzebne

    MarsRobot(String status, int speed, int power){
        this.status = status;
        this.speed = speed;
        this.power = power;

    }


    public static void main(String[] args) {
        MarsRobot marsRobot = new MarsRobot("ekslpracja", 3,20);

    }

}
