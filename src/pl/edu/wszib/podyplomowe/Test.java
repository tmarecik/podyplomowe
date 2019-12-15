package pl.edu.wszib.podyplomowe;
import pl.edu.wszib.java.PackagePresenter;

public class Test {

    public static void main(String[] args) {

        System.out.println("Znajdujemy się w pakiecie: " + Test.class.getPackage());

//        pl.edu.wszib.java.PackagePresenter javaPackagePresenter = new pl.edu.wszib.java.PackagePresenter();
        PackagePresenter javaPackagePresenter = new PackagePresenter();     // w tym przypadku zastosowaliśmy import ale lepiej dla czytelnosci używać pełnych nazw klasyfikowanych jeżeli już ich używamy
        pl.edu.wszib.podyplomowe.PackagePresenter podyplomowePackagePresenter = new pl.edu.wszib.podyplomowe.PackagePresenter();

        javaPackagePresenter.showPackage();
        podyplomowePackagePresenter.showPackage();




    }

}

