import java.io.FileWriter;
import java.io.IOException;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUtil {
    public static void writeToFile(UserData userData) {
        String filename = userData.getSurname() + ".txt";
        //после try вроде как всегда автоматическое закрытие ресурсов
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(userData.getSurname() + " " +
                    userData.getFirstName() + " " +
                    userData.getPatronymic() + " " +
                    userData.getBirthDate() + " " +
                    userData.getPhoneNumber() + " " +
                    userData.getGender() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Data has been written to file: " + filename);
    }
}

