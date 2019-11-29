package ZadanieDomowe1;
import org.jetbrains.annotations.NotNull;

public class NumericalSystemConversion {

    /*
     * helping method use for revert input string
     * strigToRever: String
     * */
    private String revert(@NotNull String stringToRevert) {

        String revertedString = "";
        int increments = stringToRevert.length();

        while (increments > 0) {
            revertedString += stringToRevert.charAt(increments - 1);
            increments -= 1;
        }
        return revertedString;
    }

    /*
     * method for make digit conversion from metric system into binary system
     * with numericSystemBase=2
     * or octal with numericSystemBase=8
     * for hexal with numericSystemBase=16
     * */
    public String numericSystemConversion(int digit, int numericSystemBase) {
        String result = "";
        String finalResult = "";
        int div;

        while (digit > 0) {
            div = digit % numericSystemBase;
            result += divChecker(Integer.toString(div));
            digit = digit / numericSystemBase;
        }

        finalResult = revert(result);
        return finalResult;
    }

    String div = "10";

    /* in hexadecyma system
    * make substitue letters in division
    * */
    public String divChecker(String div) {
        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";
        String E = "E";
        String F = "F";

        if (div.equals("10")) {
            return A; }
        else if (div.equals("11")) {
            return B; }
        else if (div.equals("12")) {
            return C; }
        else if (div.equals("13")) {
            return D; }
        else if (div.equals("14")) {
            return E; }
        else if (div.equals("15")) {
            return F; }
        else 
            return div;
    }
}


