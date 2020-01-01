//public class TTT {
//
//    /*
//    * helping method use for revert input string
//    * strigToRever: String
//    * */
//    static String revert(String stringToRevert){
//
//        String revertedString = "";
//        int increments = stringToRevert.length();
//
//        while ( increments > 0) {
//            revertedString += stringToRevert.charAt(increments - 1);
//            increments -= 1;
//        }
//        return revertedString;
//    }
//
//    /*
//    * method for make digit conversion from metric system into binary system
//    * with numericSystemBase=2
//    * or octal with numericSystemBase=8
//    * #TODO for hexal with numericSystemBase=16
//    * */
//    public static String numericSystemConversion(int digit, int numericSystemBase) {
//        String result = "";
//        String finalResult = "";
//
//        while (digit > 0) {
//            result += digit % numericSystemBase;
//            digit = digit / numericSystemBase;
//        }
//
//        finalResult = revert(result);
//        return finalResult;
//    }
//
//    public static String numbersOperation(int a, int b, String operation){
//
//        operation = "sum";
//        switch (operation){
//            case "sum":
//                break;
//
//            case "subtract":
//                break;
//
//            case "multiple":
//                break;
//
//            case "divide":
//                break;
//        }
//
//
//    }
//
//
//    public static void main(String[] args) {
//
//    int metricDigit1= 5;
//    int metricDigit2= 127;
//    int metricDigit3= 548;
//
//    String binNumb = numericSystemConversion(metricDigit1, 2);
//    System.out.println(String.format("%8s", binNumb).replace(" ", "0"));
//
//
//
//
////        System.out.println(revert);
//    }
//}


