import task2.UserJsonCreateFile;

public class Test {
    public static void main(String[] args) {
        UserJsonCreateFile userJsonCreateFile = new UserJsonCreateFile();
        userJsonCreateFile.convertTXTToJSON("./src/main/resources/file.txt","src/main/resources/User.json");
    }
}
