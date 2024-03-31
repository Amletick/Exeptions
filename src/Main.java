public class Main {
    public static void main(String[] args) {
        try {
            String[] userData = UserInputReader.readUserData();

            UserData parsedData = new UserData(userData);
            FileWriterUtil.writeToFile(parsedData);

        } catch (InvalidDataFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
