package lesson10.objectCloning;

import java.util.Scanner;

public class MyUser {
    /*
    Создать программу для реализации поверхностного и глубокого клонирования объекта
класса User. Пусть на вход программе будет передаваться тип операции клонирования
(поверхностное клонирование или глубокое), а также id юзера для клонирования
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        User user1 = new User("Vova", 27, new Id("123qwe45"));
        User user2 = new User("Oleg", 16, new Id("345kmi08"));
        User user3 = new User("Pavel", 86, new Id("341gdb69"));

        String findId = findOutId(scan);
        User originUser = selectUser(user1, user2, user3, findId);
        int choice = getChoice(scan);
        User cloneUser = copyUser(originUser, choice);
        print(originUser, cloneUser);
    }

    public static String findOutId(Scanner scan){
        System.out.print("Enter the user ID to clone: ");
        return scan.nextLine();
    }

    public  static User selectUser(User user1, User user2, User user3, String findId) {
        switch (findId) {
            case "123qwe45": return user1;
            case "345kmi08": return user2;
            case "341gdb69": return user3;
            default:
                System.out.println("There is no user with this ID.");
                return null;
        }
    }

    public static int getChoice(Scanner scan){
        System.out.print("Which cloning method do you want to choose: " +
                "superficial(1) or deep(2): ");
        int choice = scan.nextInt();
        
        while (choice < 1 || choice > 2){
            System.out.print("There is no such type of cloning. " +
                    "Please choose the first or second option: ");
            choice = scan.nextInt();
        }
        return choice;
    }

    public static User copyUser(User originUser, int choice){
        User cloneUser;
        if (choice == 1){
            cloneUser = User.copySuperficially(originUser);
        } else {
            cloneUser = User.copyDeep(originUser);
        }
        return cloneUser;
    }

    public static void print(User originUser, User cloneUser){
        System.out.println("Origin user " + originUser);
        System.out.println("Clone user " + cloneUser);
    }
}
