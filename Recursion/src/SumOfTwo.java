import java.util.Arrays;

public class SumOfTwo {
	public static int maxp = 5;
	public static int minp = 0;
	public static int temp = 0;
	public static int half = 15;

	public static void main(String[] args) {
		int[] given = { 3, 9, 5, 2, 4, 7 };
		Arrays.sort(given);
//		System.out.println(check(given));
//		System.out.println(to_binary(11));
//		System.out.println(to_binary_next(11));
		System.out.println(to_binary_recursion(0));
		System.out.println(to_binaryq(11));
	}
	
	public static String to_binaryq(int a){
	    if (a >> 1 == 0){return ""+ (a & 1);}
	    else
	    return ""+(to_binary_next(a>>1)+(a & 1)  );
	}
	
	public static String to_binary_recursion(int a){
	    if (a==0){return "";}
	    else
	    return ""+( to_binary_recursion(a>>1)+ (a & 1) );
	}
	
	public static String to_binary(int a){
	    String binary = "";
	    while(a!=0){
	        binary = ("" + (a  & 1)) + binary;
//	        System.out.println(binary);
	        a = a >> 1;
	    }
	    
	    return binary;
	}

	

public static String to_binary_next(int a){
    String binary = "";
    while(a!=0){
        if(a%2 == 0) binary = "0" + binary;
        else binary ="1" + binary;
        a = a / 2;
    }
    return binary;
}
	public static boolean check(int[] array) {

		if (maxp >= 0 && minp < array.length) {
			temp = array[minp] + array[maxp];
			if (temp < half) {
				minp = minp + 1;
				return check(array);
			} else if (temp > half) {
				maxp = maxp - 1;
				return check(array);
			} else
				return true;

		} else
			return false;
	}
}

// check(given);
// }
//
// public static void check(int[] array) {
// temp = array[minp] + array[maxp];
//
// if (maxp >= 0 && minp <= 5) {
// if (temp == half)
// System.out.println("huncha");
// else if (temp < half) {
// minp = minp + 1;
// check(array);
// } else {
// maxp = maxp - 1;
// check(array);
// }
//
// } else {
// System.out.println("hunna");
// }
//
// }
// }