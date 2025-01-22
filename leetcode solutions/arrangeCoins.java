public class arrangeCoins {
    public static void main(String[] args) {
        
    }
    public int arrange(int n) {
        int stars = n;
        int complete_rows = 0;
        for(int i = 1; i < n + 1; i++){
            if(stars >= i){
                complete_rows += 1;
            }else{
                break;
            }
            stars = stars - i;
        }
        return complete_rows;
    }
}
