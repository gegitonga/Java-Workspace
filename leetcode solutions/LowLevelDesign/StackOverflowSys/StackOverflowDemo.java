package LowLevelDesign.StackOverflowSys;

import java.util.Arrays;
import java.util.List;

public class StackOverflowDemo {
    public static void main(String[] args) {
        StackOverflowDemo demo = new StackOverflowDemo();
        demo.run();
    }
    public void run() {
        StackOverflow system = new StackOverflow();

        User alice = system.createUSer("Alice", "alice@example.com");
        User bob = system.createUSer("Bob", "bob@example.com");
        User charlie = system.createUSer("Charlie", "charlie@example.com");

        // Alice asks a question
        Question javaQuestion = system.askQuestion(alice, "What is polymorphism",
                "Can someone explain polymorphism in Java with an example?",
                Arrays.asList("java", "oop"));

        // Bob answers Alice's question
        Answer bobAnswer = system.answerQuestion(bob, javaQuestion,
                "Polymorphism in Java is the ability of an object to take on many forms...");

        // charlie comments on question
        system.addComment(charlie, javaQuestion,
                "Great question! I'm also interested in learning about this.");

        // alice comments on bob answer
        system.addComment(alice, bobAnswer, "Great answer can you provide a code example");

        // charlie votes
        system.voteQuestion(charlie, javaQuestion, 1);
        system.voteAnswer(charlie, bobAnswer, 1);

        system.acceptAnswer(bobAnswer);
        // Print out the current state
        System.out.println("Question: " + javaQuestion.getTitle());
        System.out.println("Asked by: " + javaQuestion.getAuthor().getUsername());
        System.out.println(
                "Tags: " + javaQuestion.getTags().stream().map(Tag::getName).reduce((a, b) -> a + ", " + b).orElse(""));
        System.out.println("Votes: " + javaQuestion.getVoteCount());
        System.out.println("Comments: " + javaQuestion.getComments().size());
        System.out.println("\nAnswer by " + bobAnswer.getAuthor().getUsername() + ":");
        System.out.println(bobAnswer.getContent());
        System.out.println("Votes: " + bobAnswer.getVoteCount());
        System.out.println("Accepted: " + bobAnswer.isAccepted());
        System.out.println("Comments: " + bobAnswer.getComments().size());

        System.out.println("\nUser Reputations:");
        System.out.println("Alice: " + alice.getReputation());
        System.out.println("Bob: " + bob.getReputation());
        System.out.println("Charlie: " + charlie.getReputation());

        // Demonstrate search functionality
        System.out.println("\nSearch Results for 'java':");
        List<Question> searchResults = system.searchQuestions("java");
        for (Question q : searchResults) {
            System.out.println(q.getTitle());
        }

        System.out.println("\nSearch Results for 'python':");
        searchResults = system.searchQuestions("python");
        for (Question q : searchResults) {
            System.out.println(q.getTitle());
        }

        // Demonstrate getting questions by user
        System.out.println("\nBob's Questions:");
        List<Question> bobQuestions = system.getQuestionsByUser(bob);
        for (Question q : bobQuestions) {
            System.out.println(q.getTitle());
        }

    }

}

