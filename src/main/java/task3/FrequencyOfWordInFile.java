package task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FrequencyOfWordInFile {
    public void printFrequencyOfWordInFileToConsole(String fileName) {
        Map<String, Integer> mapWords = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                String words = reader.readLine().strip();
                String[] lineWords = words.split("\\s+");

                for (String lineWord : lineWords) {
                    if (mapWords.containsKey(lineWord)) {
                        int count = mapWords.get(lineWord);
                        mapWords.put(lineWord, count + 1);
                    } else {
                        mapWords.put(lineWord, 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        mapWords.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
