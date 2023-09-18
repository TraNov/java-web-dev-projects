public class QuizRunner {
    public static void main(String[] args) {

        Quiz funWithQuizzes = new Quiz();

        MultipleChoice multipleChoice = new MultipleChoice("Do you like Ford vehicles?" +
                "\nA: Yes \nB: No\nType A or B", "A");
        funWithQuizzes.addQuestion(multipleChoice);

        CheckBox checkbox = new CheckBox("Which vehicles are Ford's. Select all that apply, " +
                " \nA: Bronco \nB: Corvette \nC: Mustang \nD: SL-500\nEnter comma separated", "A,C");
        funWithQuizzes.addQuestion(checkbox);

        TrueFalse trueFalse = new TrueFalse("Ford's motto is 'Built to last'? \nTrue or False?", "True");
        funWithQuizzes.addQuestion(trueFalse);

        funWithQuizzes.runQuiz();
    }
}