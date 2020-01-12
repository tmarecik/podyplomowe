package laboratorium17;

public class ComputationTest {

    public static void main(String[] args) {


        System.out.println(Computation.ADD.perform(1, -5));
        System.out.println(Computation.SUBTRACT.perform(5, 1));
        System.out.println(Computation.MULTIPLY.perform(1, -5));
        System.out.println(Computation.DIVIDE.perform(1, -5));

    }
}
