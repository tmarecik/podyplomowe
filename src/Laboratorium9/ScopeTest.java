package Laboratorium9;

public class ScopeTest {
    int test = 10;

    void printTest() {
        int tests = 20;
        System.out.println("Test: " + test);
    }

    public static void main(String[] args) {
        ScopeTest scopeTest = new ScopeTest();

    }

}
