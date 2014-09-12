
public class Recursion {
	private static String subword;
    private static String word;
public static void main(String[] args) {
	word = "kushal";
	recursion(word);
	
	if (word.equals(subword))
		System.out.println(word + " and " + subword + " are palindrome.");
	else
		System.out.println(word + " and " + subword + " are Not palindrome.");
}
public static String recursion(String word){

	if (word.length()==1)
		return word;
	else
	{
		subword = word.substring(word.length()-1) + recursion(word.substring(0, word.length()-1));
	}
		
	return subword;
}
}
