package modifiers;

public class Tester {
    public static void main(String[] args) {

        A a = new A();
        a.setNumber(20);
        System.out.println(a.getNumber());

    }

}


class A {
    private int number;
    private boolean status;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isStatus() {    //dla boolean -> geter jest nazwany "is"Status
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

