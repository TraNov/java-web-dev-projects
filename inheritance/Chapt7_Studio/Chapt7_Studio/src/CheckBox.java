public class CheckBox extends Question {

    public CheckBox(String question, String answer) {
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