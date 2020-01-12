package collection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MonetCristo {

    public static void main(String[] args) {
        MonetCristo monetCristo = new MonetCristo();
        List<String> allLines = monetCristo.loadTestFile("src/collection/crsto101.txt");
        System.out.println(allLines.get(3000));

        int rowCount = monetCristo.countRow(allLines);
        System.out.println("Monte Cristo Row Count: " + rowCount);

        monetCristo.displayEveryHundredRow(allLines);
        monetCristo.showThelongestVerse(allLines);


    }


    private List<String> loadTestFile(String testFileName){
        try {
            return Files.readAllLines(Paths.get(testFileName));
        } catch (IOException e) {
            System.out.println("Błąd: Coś poszło nie tak przy wczytywaniu pliku" + e.getMessage());
        }
        return null;
    }

    private int countRow(List allLines){
        return allLines.size();
    }

    private void displayEveryHundredRow(List allLines){

        for (int i =0; i < allLines.size(); i++){
            if (i%100 == 0){
                System.out.println("Index: " + i + "Row: " + allLines.get(i));
            }
        }
    }

    private void showThelongestVerse(List<String> list){
        String longestLine = "";
        for(String line :  list){
            if (line.length() > longestLine.length()){
                longestLine = line;
            }
        }
        System.out.println(longestLine);
    }

}
