package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InformationSearch {
    /*
    Программа на вход получает произвольный текст. В этом тексте может быть номер
документа(один или несколько), емейл и номер телефона. Номер документа в формате:
xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
может содержать не всю информацию, т.е. например, может не содержать номер
телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
формате:
email: teachmeskills@gmail.com
document number: 1423-1512-51
и т.д
     */
    public static void main(String[] args) {
        String text = getText();

        getDocumentNumber(text);
        getAPhoneNumber(text);
        getEmail(text);
    }

    public static String getText(){
        return "In the same way, if you tell them: “Here in document No. 1915-7463-48 " +
                "from 11.11.2025 there is evidence that the Little Prince really existed - " +
                "he was very, very nice, he laughed, and he wanted to have a lamb. " +
                "And whoever wants a lamb, of course, exists, if you say that, they'll " +
                "just shrug and look at you like you're a clueless baby. But if you tell them, " +
                "He flew in from another planet, immediately got himself a mobile phone with the " +
                "number +(29)4578164 and the email address littleprince@gmail.com, that will " +
                "convince them, and they won't bother you with questions.";
    }

    public static void getDocumentNumber(String text){
        Pattern pattern = Pattern.compile("\\b[0-9]{1,4}-[0-9]{1,4}-[0-9]{1,2}\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println("document number: " + matcher.group());
        }
    }

    public static void getAPhoneNumber(String text){
        Pattern pattern = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println("phone number: " + matcher.group());
        }
    }

    public static void getEmail(String text){
        Pattern pattern = Pattern.compile("\\w{2,}@\\w{3,}\\.\\w{2,3}\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println("email: " + matcher.group());
        }
    }
}
