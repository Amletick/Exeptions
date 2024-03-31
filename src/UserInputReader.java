import java.util.Scanner;

public class UserInputReader {
    public static String[] readUserData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в формате: Фамилия Имя Отчество дата_рождения номер_телефона пол");
        String userData = scanner.nextLine();
        return userData.split(" ");
    }
}
