import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class UserData {
    private String surname;
    private String firstName;
    private String patronymic;
    private String birthDate;
    private long phoneNumber;
    private char gender;

    public UserData(String[] data) throws InvalidDataFormatException {
        if (data.length > 6) {
            throw new InvalidDataFormatException("Invalid number of fields(too much)");
        } else if (data.length < 6) {
            throw new InvalidDataFormatException("Invalid number of fields(too little)");
        }


        try {
            this.surname = data[0];
            this.firstName = data[1];
            this.patronymic = data[2];
            //this.birthDate = data[3];
            this.phoneNumber = Long.parseLong(data[4]);
            this.gender = data[5].charAt(0);

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException | StringIndexOutOfBoundsException e) {
            throw new InvalidDataFormatException("Invalid field format");
        }
        try {
            // Проверяем формат даты
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            dateFormat.setLenient(false);
            Date parsedDate = dateFormat.parse(data[3]);
            this.birthDate = data[3];
        } catch (ParseException e) {
            throw new InvalidDataFormatException("Invalid date format");
        }
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public char getGender() {
        return gender;
    }
}
