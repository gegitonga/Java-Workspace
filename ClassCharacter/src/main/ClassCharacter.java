package main;

public class ClassCharacter {
    public static void main(String[] args){
        String s = "abababx";

        int[] counts= countLetters(s.toLowerCase());

        //display
        for(int i = 0; i<counts.length; i++){
            System.out.println((char)('a' + i) + "appears" + counts[i] + ((counts[i] == 1) ? " time" : " times"));
        }

    }

    public static int[] countLetters(String s){
        int [] counts = new int[26];

        for(int i = 0; i < counts.length; i++){
            if(Character.isLetter(s.charAt(i))){
                counts[s.charAt(i) - 'a']++;
            }
        }
        return counts;
    }


}
