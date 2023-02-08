package task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class UserJsonCreateFile {
    public void convertTXTToJSON(String nameInputFile, String nameOutPutFile){
        LinkedList<User> users = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nameInputFile))) {
            while (reader.ready()) {
                String words = reader.readLine().strip();
                if(!words.contains("name age")){
                    String[] lineWords = words.split("\\s+");
                    users.add(new User(lineWords[0],Integer.parseInt(lineWords[1])));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter(nameOutPutFile))
        {

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(users);

            System.out.println(json);

            //String text = "Hello, World!";
            writer.write(json);
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    private static class User{
        private final String name;
        private final int age;
        public User(String name,int age){
            this.name = name;
            this.age = age;
        }
    }
}
