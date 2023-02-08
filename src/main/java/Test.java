import task1.FileReadingValidPhoneNumbers;
import task2.UserJsonCreateFile;
import task3.FrequencyOfWordInFile;

public class Test {
    public static void main(String[] args) {
        FileReadingValidPhoneNumbers fileReadingValidPhoneNumbers = new FileReadingValidPhoneNumbers();
        fileReadingValidPhoneNumbers.printPhoneNumbersToConsole();


        UserJsonCreateFile userJsonCreateFile = new UserJsonCreateFile();
        userJsonCreateFile.convertTXTToJSON("./src/main/resources/file.txt", "src/main/resources/User.json");

        FrequencyOfWordInFile frequencyOfWordInFile = new FrequencyOfWordInFile();
        frequencyOfWordInFile.printFrequencyOfWordInFileToConsole("./src/main/resources/words.txt");

    }
}
