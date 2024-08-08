package quiz;

import java.util.ArrayList;
import java.util.List;

public class QuizManager {
    private List<Quiz> quizzes;

    public QuizManager() {
        this.quizzes = new ArrayList<>();
    }

    public void createQuiz(String title) {
        quizzes.add(new Quiz(title));
    }

    public void addQuestionToQuiz(String quizTitle, Question question) {
        for (Quiz quiz : quizzes) {
            if (quiz.getTitle().equals(quizTitle)) {
                quiz.addQuestion(question);
                return;
            }
        }
        System.out.println("Quiz not found!");
    }

    public void takeQuiz(String quizTitle) {
        for (Quiz quiz : quizzes) {
            if (quiz.getTitle().equals(quizTitle)) {
                quiz.takeQuiz();
                return;
            }
        }
        System.out.println("Quiz not found!");
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }
}
