public class CheckInclusion {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        check(s1, s2);
    }

    public static boolean check(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s1.length();

        if(length1 > length2){
            return false;
        }

        int[] charCountDelta = new int[26];

        for(int i = 0; i < length1; ++i){
            charCountDelta[s1.charAt(i) - 'a'] --;
            charCountDelta[s2.charAt(i) - 'a'] ++ ;
        }

        int nonZeroCount = 0;
        for(int count : charCountDelta){
            if(count != 0){
                nonZeroCount++;
            }
        }

        if(nonZeroCount == 0){
            return true;
        }

        for(int i = length1; i < length2; ++i){
            int charLeft = s2.charAt(i - length1) - 'a';
            int charRight = s2.charAt(i) - 'a';
        }

    }
    

}
