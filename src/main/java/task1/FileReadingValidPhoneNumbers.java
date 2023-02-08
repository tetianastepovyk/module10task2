package task1;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReadingValidPhoneNumbers {
    public void printPhoneNumbersToConsole() {
        try (BufferedReader reader = new BufferedReader(new FileReader("./src/main/resources/file1"))) {
            while (reader.ready()) {
                String phoneNumber = reader.readLine().strip();
                if (isValidPhoneNumber(phoneNumber)) {
                    System.out.println(phoneNumber);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        Pattern p = Pattern.compile("^(\\d{3}-\\d{3}-\\d{4})$|^(\\(\\d{3}\\) \\d{3}-\\d{4})$");
        Matcher m = p.matcher(phoneNumber);
        return m.find();
    }
}
