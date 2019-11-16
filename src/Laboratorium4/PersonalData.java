package Laboratorium4;

public class PersonalData {

    String firstName;
    String lastName;
    int age;
    char gender;
    long personalIdnumber;

    PersonalData(String firstName, String lastName, int age, char gender, long personalIdnumber){

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.personalIdnumber = personalIdnumber;

    }

//    public static void showPersonalData(String firstName, String lastName, int age, char gender, long personalIdnumber){
    public void showPersonalData(){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Personal Id number: " + personalIdnumber);
    }

    public static void main(String[] args) {

        PersonalData personalData = new PersonalData("Jan", "Kowalski", 34, 'm', 8306112501L);
        personalData.showPersonalData();

    }




}
