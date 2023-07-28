

import java.util.*;

public class QuizGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        
        String[] questions = {
            "What is the capital of France?\nA. Paris\nB. London\nC. Berlin\n",
            "What is the largest planet in our solar system?\nA. Earth\nB. Jupiter\nC. Mars\n",
            "What is the largest animal in the world?\nA. Elephant\nB. Blue Whale\nC. Giraffe\n"
        };
        
        String[] answers = {"A", "B", "B"};
        
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String userAnswer = input.nextLine().toUpperCase();
            
            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }
        }
        
        System.out.println("Your final score is: " + score + " out of " + questions.length);
    }
}
