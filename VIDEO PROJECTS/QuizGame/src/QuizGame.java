import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {"What is the main function of router",
                              "Which part of computer is considered brain",
                              "What year Facebook was launched",
                              "Who is known as the father of computer",
                              "What was the first Programming language"};

        String[][] options = {{"1. Storing files","2. Encrypting Data","3. Directing Internet traffic","4. Poti Karna"},
                              {"1. CPU","2. Hard Drive","3. RAM","4. GPU"},
                              {"1. 2000","2. 2004","3. 2006","4. 2008"},
                              {"1. Steve Jobs","2. Bill Gates","3. Alan Turing","4. Charles Babbage"},
                              {"1. Cobalt","2. C","3. Fortran","4. Assembly"}};
        int[] answers = {3,1,2,4,3};
        int score = 0;
        int guess ;

        System.out.println("************************");
        System.out.println("Welcome to the quiz game");
        System.out.println("************************");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter Your guess : ");
            guess = scanner.nextInt();

            if (guess == answers[i]){
                System.out.println("*******");
                System.out.println("Correct");
                System.out.println("*******");
                score += 1 ;
            }else {
                System.out.println("*****");
                System.out.println("Wrong");
                System.out.println("*****");
            }
        }

        System.out.println("You got a score of : " + score + " out of " + questions.length);
    }


}
