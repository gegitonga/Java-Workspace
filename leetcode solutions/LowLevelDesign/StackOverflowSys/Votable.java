package LowLevelDesign.StackOverflowSys;

public interface Votable {
    void vote(User user, int value);
    int getVoteCount();
}
