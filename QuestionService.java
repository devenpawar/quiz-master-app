
import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question("Java", 1, "Java", "CPP", "Python", "C#",
                "Which programming language was founded in 1995?");
        questions[1] = new Question("Python", 2, "Ruby", "JavaScript", "Python", "PHP",
                "Which language is known for its readability and simplicity?");
        questions[2] = new Question("C++", 3, "C", "Java", "C++", "Swift",
                "Which programming language is often used for system programming?");
        questions[3] = new Question("JavaScript", 4, "Python", "JavaScript", "Ruby", "C#",
                "Which language is commonly used for web development?");
        questions[4] = new Question("Swift", 5, "Java", "Kotlin", "Swift", "Dart",
                "Which programming language is primarily used for iOS development?");

    }

    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question Number: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("Options: ");
            System.out.println(q.getOpt1() + " " + q.getOpt2() + " " + q.getOpt3() + " " + q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();
        }

    }

    public void printScore() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if (actualAnswer.equals(userAnswer))
                score += 2;

        }

        System.out.println("FINAL SCORE IS: " + score);
    }

}
