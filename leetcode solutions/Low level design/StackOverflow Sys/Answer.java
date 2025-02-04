import java.util.*;

public class Answer implements Votable, Commentable{
    private final int id;
    private final String content;
    private final User author;
    private final Question question;
    private boolean isAccepted;
    private final Date creationDate;
    private final List<Comment> comments;
    private final List<Vote> votes;

    public Answer(User author, Question question, String content){
        this.id = generateId();
        this.author = author;
        this.question = question;
        this.content = content;
        this.creationDate = new Date();
        this.votes = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.isAccepted = false;
    }

    private int generateId(){
        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    @Override
    public void addComment(Comment comment) {

    }
    @Override
    public List<Comment> getComments() {

    }
    @Override
    public void vote(User user, int value) {

    }
    @Override
    public int getVoteCount() {

    }
}
