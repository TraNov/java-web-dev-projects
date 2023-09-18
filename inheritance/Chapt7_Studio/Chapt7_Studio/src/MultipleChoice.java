public class MultipleChoice extends Question {

    public MultipleChoice(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        String userAnswer = this.getAnswer();
        if (answer.toLowerCase().equals(userAnswer.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}
