import javax.swing.JOptionPane;
import java.util.Objects;
import java.util.Random;


public class Test {
    private final String[] questions = {
            "1)In which year was the java language project initiated?\na)1990\nb)1991\nc)1992\nd)1993",
            "2)Which of the following tools support the software-development process, including editors\n for writing and editing programs and debuggers for locating logic errors—errors that cause programs to execute incorrectly?\na)Java Integrated Development Envronments (IDE)\nb)Java Virtual Machine (JVM)\nc)Java Development Kit (JDK)\nd)Java Application Programming Interfaces (API)"
    };

    private final String[] answers = {"1991", "Java"};

    private int correctAnswers = 0;

    private int inCorrectAnswers = 0;

    public void inputAnswer() {
        simulateQuestion(questions);
        double percentageOfCorrectAns = ((double) correctAnswers / questions.length) * 100;
        String message1 = String.format("Correct Answers: %s", correctAnswers);
        String message2 = String.format("InCorrect Answers: %s", inCorrectAnswers);
        String message3 = String.format("Percentage of correct answer: %s", percentageOfCorrectAns);
        JOptionPane.showMessageDialog(null, message1);
        JOptionPane.showMessageDialog(null, message2);
        JOptionPane.showMessageDialog(null, message3);

    }

    public void simulateQuestion(String[] questions) {
        for (String question : questions) {
            JOptionPane.showMessageDialog(null, question);
            String answer = JOptionPane.showInputDialog("Answer:");
            checkAnswer(answer);

        }

    }

    public void checkAnswer(String answer) {
        String value = "incorrect";
        for (String answerr : answers) {

            if (Objects.equals(answer, answerr)) {
                value = "correct";
                break;
            }
        }
        generateMessage(value);
    }


    public void generateMessage(String value){

        Random random = new Random();
        if(Objects.equals(value, "correct")){
            correctAnswers++;
            switch (random.nextInt(3)) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Good!");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Excellent!");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Superb!");
                    break;

            }
        }
        else {
            inCorrectAnswers++;
            switch (random.nextInt(3)) {
                case 0:
                    JOptionPane.showMessageDialog(null, "No. Please try again!");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Wrong. Try once more");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "No. Keep trying..");
                    break;

            }
        }
    }
}
