package enums;

public class Tshirt {
    private TshirtSize size;
    private String  manufacture;

    public Tshirt(TshirtSize size, String manufacture) {
        this.size = size;
        this.manufacture = manufacture;
    }

    public static void main(String[] args) {

        Tshirt tshirtL =  new Tshirt(TshirtSize.L, "PolSport");
        Tshirt tshirtS =  new Tshirt(TshirtSize.S, "PolSport");
        Tshirt tshirtM =  new Tshirt(TshirtSize.M, "Naj-Tan-Sii");

        System.out.println(tshirtL.size);
        System.out.println(tshirtL.size.getChestWidth() + " " + tshirtL.size.getShirtLenght());

        System.out.println(tshirtL.getTshirtSizeDetails());
        System.out.println(tshirtS.getTshirtSizeDetails());
        System.out.println(tshirtM.getTshirtSizeDetails());




    }

    public String getTshirtSizeDetails(){
        return size + "(" + size.getShirtLenght() + " " + size.getChestWidth() + " " + size.getSleeveLenght()  + ")" + manufacture;
    }

}
