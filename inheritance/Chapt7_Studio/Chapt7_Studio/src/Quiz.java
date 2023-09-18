
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int correctAnswers = 0;
    private Scanner scanner = new Scanner(System.in);

    public Quiz() {

    }

    public ArrayList<Question> getQuestions() {
        return this.questions;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        for (Question question : questions) {
            System.out.println(question.getQuestion());
            String usersAnswer = this.getUserAnswer();
            boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);
            if (userGotQuestionCorrect) {
                this.correctAnswers++;
            }
        }

        double percentageCorrect = ((double) this.correctAnswers / (double) this.questions.size()) * 100;
        System.out.println("User's Grade: " + percentageCorrect + "%");
    }

    private String getUserAnswer() {
        String userAnswer = scanner.nextLine();
        return userAnswer;
    }
}