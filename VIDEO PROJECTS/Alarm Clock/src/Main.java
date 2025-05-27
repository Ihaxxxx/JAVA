import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null ;
        String filePath = "E:\\MUbashir\\Mubashir Code\\JAVA\\VIDEO PROJECTS\\Alarm Clock\\src\\Kendrick Lamar - luther (Official Audio).wav";


        while (alarmTime == null){
            try {
                System.out.print("Enter an alarm time (HH:MM:SS)  : ");
                String inputTime = scanner.nextLine();
                alarmTime = LocalTime.parse(inputTime,dateTimeFormatter);
                System.out.println("Allarm set for " + alarmTime);
            }catch (DateTimeParseException e ){
                System.out.println("Invalid format. Please use (HH:MM:SS) ");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime,filePath,scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmClock.run();


    }
}
