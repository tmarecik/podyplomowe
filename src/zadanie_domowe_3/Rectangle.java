package zadanie_domowe_3;

public class Rectangle {
    int width;
    int height;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int width) {
        this.width = width;
        this.height = width;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int are(){
        return this.width*this.height;
    }

    public static void main(String[] args) {

        Rectangle zero = new Rectangle();
        System.out.println("zero area: " + zero.are());

        Rectangle rectangle = new Rectangle( 2, 4);
        System.out.println("rectangle area: " + rectangle.are());

        Rectangle squere = new Rectangle( 2);
        System.out.println("squere area: " + squere.are());
    }

}
