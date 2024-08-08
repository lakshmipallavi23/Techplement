package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuizManager quizManager = new QuizManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create a quiz");
            System.out.println("2. Add a question to a quiz");
            System.out.println("3. Take a quiz");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter quiz title: ");
                    String title = scanner.nextLine();
                    quizManager.createQuiz(title);
                    break;
                case 2:
                    System.out.print("Enter quiz title: ");
                    String quizTitle = scanner.nextLine();
                    System.out.print("Enter question text: ");
                    String questionText = scanner.nextLine();
                    System.out.print("Enter options (comma separated): ");
                    String[] optionsArray = scanner.nextLine().split(",");
                    System.out.print("Enter correct answer index (starting from 1): ");
                    int correctAnswerIndex = scanner.nextInt() - 1;
                    scanner.nextLine();
                    Question question = new Question(questionText, Arrays.asList(optionsArray), correctAnswerIndex);
                    quizManager.addQuestionToQuiz(quizTitle, question);
                    break;
                case 3:
                    System.out.print("Enter quiz title: ");
                    String quizToTake = scanner.nextLine();
                    quizManager.takeQuiz(quizToTake);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
