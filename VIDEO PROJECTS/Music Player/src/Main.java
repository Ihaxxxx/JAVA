import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome To the music Player here are the music in our library");


//      MAC
//        String SongsDirectoryPath = "/Users/apple/Documents/Mubashir Code/JAVA/VIDEO PROJECTS/Music Player/Songs";

//      Windows
        String SongsDirectoryPath = "E:\\MUbashir\\Mubashir Code\\JAVA\\VIDEO PROJECTS\\Music Player\\Songs";
        File SongDirectory = new File(SongsDirectoryPath);
        File[] files = SongDirectory.listFiles();

        int Count = 1 ;
        for (File file : files){
            String SongName = file.getName();
            String[] Song = SongName.split(".wav",2);
            System.out.println(Count + " " + Song[0]);
            Count = Count + 1 ;
        }

        String musicFilePath = "";

        System.out.print("Enter the Number of music do you want to listen : ");
        int musicChoice = scanner.nextInt();
        switch (musicChoice){
//            MAC
//            case 1-> musicFilePath = "/Users/apple/Documents/Mubashir Code/JAVA/VIDEO PROJECTS/Music Player/Songs/"+files[0].getName();
//            case 2-> musicFilePath = "/Users/apple/Documents/Mubashir Code/JAVA/VIDEO PROJECTS/Music Player/Songs/"+files[1].getName();
//            case 3-> musicFilePath = "/Users/apple/Documents/Mubashir Code/JAVA/VIDEO PROJECTS/Music Player/Songs/"+files[2].getName();
//            Windows
            case 1-> musicFilePath = "E:\\MUbashir\\Mubashir Code\\JAVA\\VIDEO PROJECTS\\Music Player\\Songs\\"+files[0].getName();
            case 2-> musicFilePath = "E:\\MUbashir\\Mubashir Code\\JAVA\\VIDEO PROJECTS\\Music Player\\Songs\\"+files[1].getName();
            case 3-> musicFilePath = "E:\\MUbashir\\Mubashir Code\\JAVA\\VIDEO PROJECTS\\Music Player\\Songs\\"+files[2].getName();
            default -> System.out.println("Invalid number");
        }

        System.out.println("Press P to play the song " + files[musicChoice-1].getName());

        File file = new File(musicFilePath);

        try{
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);


            String response = "";

            while (!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice : ");

                response = scanner.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid Choice");
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch (IOException e){
            System.out.println("Something Went Wrong");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        }
        finally {
            System.out.println("Byieeeee");
        }

    }
}