import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. Which language is used for Android Development?",
                "2. Which keyword is used to create an object in Java?",
                "3. Which company developed Java?",
                "4. What is the extension of Java source file?",
                "5. Which loop executes at least once?"
        };

        String[][] options = {
                {"A. Java", "B. Python", "C. C", "D. PHP"},
                {"A. class", "B. object", "C. new", "D. this"},
                {"A. Microsoft", "B. Sun Microsystems", "C. Google", "D. Apple"},
                {"A. .class", "B. .java", "C. .exe", "D. .jar"},
                {"A. for", "B. while", "C. do-while", "D. foreach"}
        };

        char[] answers = {'A', 'C', 'B', 'B', 'C'};

        int score = 0;

        System.out.println("===== QUIZ APPLICATION =====");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.println("You have 10 seconds to answer.");
            long startTime = System.currentTimeMillis();

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            long endTime = System.currentTimeMillis();

            if ((endTime - startTime) > 10000) {
                System.out.println("Time Over!");
                continue;
            }

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct Answer: " + answers[i]);
            }
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Total Questions : " + questions.length);
        System.out.println("Correct Answers : " + score);
        System.out.println("Wrong Answers   : " + (questions.length - score));
        System.out.println("Score           : " + score + "/" + questions.length);

        sc.close();
    }
}
