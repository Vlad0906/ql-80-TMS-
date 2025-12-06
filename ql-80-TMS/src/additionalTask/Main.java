package additionalTask;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> elementList = new ArrayList<>();

        if (args.length > 0) {
            for (String arg : args) {
                elementList.add(arg);
            }
        }

        Terminal terminal = new Terminal(elementList);

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("ql-80-TMS/src/additionalTask/Text.txt"))) {
            oos.writeObject(terminal);
            System.out.println("Object serialized.");
        } catch (IOException e) {
            System.err.println("An error occurred while serializing the object: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("ql-80-TMS/src/additionalTask/Text.txt"))) {
            Terminal loadedTerminal = (Terminal) ois.readObject();
            System.out.println("The object is deserialized.");
            System.out.println(loadedTerminal);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("An error occurred while deserializing the object: " + e.getMessage());
        }
    }
}
