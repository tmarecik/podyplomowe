package lab13.packTester;

public class PackageTesterApp {

    public static void main(String[] args) {

        lab13.packTester.tester1.PackageTester pacTest1 = new lab13.packTester.tester1.PackageTester();
        lab13.packTester.tester2.PackageTester pacTest2 = new lab13.packTester.tester2.PackageTester();
        lab13.packTester.tester3.PackageTester pacTest3 = new lab13.packTester.tester3.PackageTester();

        pacTest1.introduce();
        pacTest2.introduce();
        pacTest3.introduce();

    }

}
