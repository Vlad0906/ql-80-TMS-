package lesson14.workingWithAFile;

import java.io.*;

public class RomeoAndJuliet {
    /*
    В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
Проанализировать и записать в другой файл самое длинное слово.
     */
    public static void main(String[] args) {
        readDocumentReWrite();
    }

    public static void readDocumentReWrite(){
        String maxWord = "";

        try (BufferedReader reader = new BufferedReader
                (new FileReader("ql-80-TMS/src/lesson14/workingWithAFile/Romeo.txt"));
             BufferedWriter writer = new BufferedWriter
                     (new FileWriter("ql-80-TMS/src/lesson14/workingWithAFile/Juliet.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] arrayString = line.split("\\s+");
                for(String word : arrayString){
                    if(word.length() > maxWord.length()){
                        maxWord = word;
                    }
                }
            }
            writer.write(maxWord);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
