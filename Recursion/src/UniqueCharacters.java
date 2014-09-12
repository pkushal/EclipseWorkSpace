public class UniqueCharacters {
	private static boolean status = false;

	public static void main(String[] args) {
		System.out.println("The given String has unique characters : "
				+ findUniqueCharacters("abcdcab"));
		char a='a';
		System.out.println(a);
	}

//kunai pani string manipulation garda, character lai ASCII ma convert garda sajilo huncha...total ASCII characaters is 256
	// so 256 ko array make garne ani suppose character 'a' lai check garnu cha bhane int a='a' le 97 dincha ani tyo array index
	//ko 97 ma ++ garne ani kei condition check garne.
	
	public static boolean findUniqueCharacters(String input) {
		System.out.println("the input is : " + input);

		for (int i = 0; i < input.length(); i++) {
//			System.out.println("iteration number : " + i);
			for (int j = 0; j < input.length(); j++) {
//				System.out.println("j= " + j);
				if (i != j) {
					{
						if (input.charAt(i) != input.charAt(j)) {
							status = true;
//							System.out.println(input.charAt(i) + " and " + input.charAt(j) + " is "
//									+ status);
						} else {
							status = false;
//							System.out.println(input.charAt(i) + " and " + input.charAt(j) + " is "
//									+ status);
							break;
						}
					}
				}
			}
			if (status ==true) return status;
		}
		return status;
	}
}
