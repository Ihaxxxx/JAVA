import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/apple/Documents/Mubashir Code/JAVA/JAVA CLASSES/Filling/Read File/test.txt";


        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null ){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("Could not locate the file");
        }catch (IOException e){
            System.out.println("Something went wrong");
        }
    }
}