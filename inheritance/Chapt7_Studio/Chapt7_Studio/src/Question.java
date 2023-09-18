public abstract class Question {

    private final String theQuestion;
    private final String theAnswer;

    public Question(String question, String answer) {
        this.theQuestion = question;
        this.theAnswer = answer;
    }

    public String getQuestion() {
        return this.theQuestion;
    }

    public String getAnswer() {
        return this.theAnswer;
    }

    public abstract boolean checkAnswer(String answer);
}