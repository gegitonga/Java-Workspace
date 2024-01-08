public class Test {
	public static void main(String[] args){
		String[] tokens = "Java#HTML#Perl".split("#", 0);
		for(int i = 0; i < tokens.length; i++){
			System.out.println(tokens[i] + " ");
		}
		String s = "a+b$#c".replaceAll("[$#+]", "NNN");
		System.out.println(s);
		
		String txt = "Java";
		char[] chars = txt.toCharArray();
		for(int i = 0; i < chars.length; i++){
			System.out.println(chars[i] + " ");
		}
		
		char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
		"CS3720".getChars(2,6, dst, 4);
	}
}