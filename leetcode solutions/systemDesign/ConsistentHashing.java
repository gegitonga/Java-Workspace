package systemDesign;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;


public class ConsistentHashing {
    private final int numReplicas;
    private final TreeMap<Long, String> ring;
    private final Set<String> servers;


    public ConsistentHashing(List<String> servers, int numReplicas){
        this.numReplicas = numReplicas;
        this.ring = new TreeMap<>();
        this.servers = new HashSet<>();

        for(String server: servers){
            addserver(server);
        }
    }

    private Long hash(String key){
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(key.getBytes());
            byte[] digest = md.digest();

            return ((long) (digest[0] & 0xFF) << 24) |
            ((long) (digest[1] & 0xFF) << 16) |
            ((long) (digest[2] & 0xFF) << 8) |
            ((long) (digest[3] & 0xFF));
        }catch(NoSuchAlgorithmException e){
            throw new RuntimeException("MD5 algorithmn not found", e);
        }
    }

    public void addserver(String server){
        servers.add(server);
        for(int i =0; i<numReplicas;i++){
            long hash = hash(server + "-" + i);
            ring.put(hash, server);
        }
    }

    public void removeServer(String server){
        if(servers.remove(server)){
            for(int i =0; i<numReplicas;i++){
                long hash = hash(server + "-" + i);
                ring.remove(hash);
            }
        }
    }
    public String getServer(String key){
        if(ring.isEmpty()){
            return null;
        }

        long hash = hash(key);
        Map.Entry<Long, String> entry = ring.ceilingEntry(hash);
        if(entry == null){
            entry = ring.firstEntry();
        }

        return entry.getValue();
    }
}
