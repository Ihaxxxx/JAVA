import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String filePath = "/Users/apple/Documents/Mubashir Code/JAVA/JAVA CLASSES/Filling/Writing Files/test.txt";
        String textContent = "I like pizza! \n its reallly good \n buy me one ";

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch (FileNotFoundException e){
            System.out.println("Invalid Path");
        }
        catch (IOException e){
            System.out.println("Could not write file");
        }

    }
}