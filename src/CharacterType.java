public class CharacterType {

    public static void main(String[] args) {
        showInfo('a');
        showInfo('b');
        showInfo('c');
        showInfo('\t');
        showInfo('ą');
    }

    public static void showInfo(char c){

        System.out.println("kod znaku '" + c + "' to: " + (int)c );
    }

}
