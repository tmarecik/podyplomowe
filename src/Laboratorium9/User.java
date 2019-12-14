package Laboratorium9;

public class User {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public static void main(String[] args) {

        User user = new User();
        user.setName("Jozek");
        System.out.println(user.getName());
    }


}
