/**
 * A question model used in quiz game. It consists of a prompt, a user answer, and a correct answer number.
 * @author Yao Kan KOUASSI
 * @date 2023-02-10
 */
public class Question {
    
    private String prompt;
    /**
     * Answer input by user
     */
    private char answer;
    /**
     * Correct answer for this question
     */
    private char correctAnswer;

    public Question(String prompt, char correctAnswer) {
        this.prompt = prompt;
        this.correctAnswer = correctAnswer;
        // default user answer is a white space character
        this.answer = ' ';
    }

    public Question(String prompt, char answer, char correctAnswer) {
        this.prompt = prompt;
        this.answer = answer;
        this.correctAnswer = correctAnswer;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public char getAnswer() {
        return answer;
    }

    public void setAnswer(char answer) {
        this.answer = answer;
    }

    public char getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(char correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
