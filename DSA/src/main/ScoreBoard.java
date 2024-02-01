package main;

public class ScoreBoard {
    private int numEtries = 0;
    private GameEntry[] board;

    public ScoreBoard(int capacity){
        board = new GameEntry[capacity];
    }

    public void add(GameEntry entry){
        int newScore = entry.getScore();
        if(numEtries < board.length || newScore > board[numEtries-1].getScore()){
            if(numEtries < board.length)
                numEtries++;
            int j = numEtries -1;
            while(j > 0 && board[j - 1].getScore() < newScore ){
                board[j] = board[j - 1];
                j--;
            }
            board[j] = entry;
        }
    }
    public GameEntry remove(int i) throws  IndexOutOfBoundsException{
        if (i < 0 || i >= numEtries)
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        GameEntry temp = board[i];
        for(int j = i; j < numEtries - 1; i++)
            board[j] = board[j + 1];
        board[numEtries - 1] = null;
        numEtries--;
        return temp;
    }
}
