package lesson14.validDocument;

import java.io.*;
import java.util.Scanner;

public class Main {
    /*
    Допустим есть txt файл с номерами документов. Номером документа является строка,
состоящая из букв и цифр(без служебных символов). Пусть этот файл содержит каждый
номер документа с новой строки и в строке никакой другой информации, только номер
документа. Валидный номер документа должен иметь длину 15 символов и начинаться с
последовательности docnum(далее любая последовательность букв/цифр) или
contract(далее любая последовательность букв/цифр). Написать программу для чтения
информации из входного файла - путь к входному файлу должен задаваться через
консоль. Программа должна проверять номера документов на валидность. Валидные
номера документов следует записать в один файл-отчет. Невалидные номера документов
следует записать в другой файл-отчет, но после номеров документов следует добавить
информацию о том, почему этот документ не валиден
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String path = getPath(scan);
        readValidityDocumentsAndRecording(path);
    }

    public static String getPath(Scanner scan){
        System.out.print("Specify the path to the input file you want to read: ");
        return scan.nextLine();
    }

    public static void readValidityDocumentsAndRecording(String path){
        try (BufferedReader reader = new BufferedReader(new FileReader(path));
             BufferedWriter writer = null) {

            String line;
            while ((line = reader.readLine()) != null) {
                checkForValidity(line, writer);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkForValidity(String line, BufferedWriter writer) throws IOException {
        if(line.length() == 15 && line.matches("^(docnum|contract)[a-zA-Z0-9]*")){
            writer = new BufferedWriter(new FileWriter(
                    "ql-80-TMS/src/lesson14/validDocument/correct documents.txt", true));
            writer.write(line);
            writer.newLine();
            writer.close();
        } else{
            writer = new BufferedWriter(new FileWriter(
                    "ql-80-TMS/src/lesson14/validDocument/ invalid documents.txt", true));
            writer.write(line);
            if(line.length() > 15){
                writer.write(" - the document number contains more than 15 characters");
            } else if (line.length() < 15) {
                writer.write(" - the document number contains less than 15 characters");
            } else if(line.matches(".*\\W.*")){
                writer.write(" - the document number contains a non-alphanumeric character");
            }
            writer.newLine();
            writer.close();
        }
    }
}
