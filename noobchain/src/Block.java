import java.util.*;

public class Block {

    public String hash;
    public String previousHash;
    private String data;
    private long timestamp;

    public Block(String data,String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        this.timestamp = System.currentTimeMillis();
    }

}
