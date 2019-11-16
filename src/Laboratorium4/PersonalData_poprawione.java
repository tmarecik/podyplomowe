package Laboratorium4;

public class PersonalData_poprawione {

    String firstName;
    String lastName;
    int age;
    char gender;
    long personalIdnumber;

    PersonalData_poprawione(String firstName, String lastName, int age, char gender, long personalIdnumber){

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.personalIdnumber = personalIdnumber;

    }

    public void showPersonalData(){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Personal Id number: " + personalIdnumber);
    }

    public static void main(String[] args) {

        PersonalData_poprawione personalData = new PersonalData_poprawione("Jan", "Kowalski", 34, 'm', 8306112501L);
        personalData.showPersonalData();

    }




}
