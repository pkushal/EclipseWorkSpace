import java.util.ArrayList;

public class Recurring {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println(recur(a, b));
	}

	public static int recur(int a, int b) {
		int len = String.valueOf(b).length();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ArrayList<Integer> modvalues = new ArrayList<Integer>();

		do {
			ans.add(a/ b);
			a = a % b;
			if(modvalues.contains(a)){ //O(n)    
				break;
			}
			modvalues.add(a);
			a*=10;
		} while (true);
		System.out.print(ans.get(0)+".");
		
		for(int i =1; i< ans.size(); i++){
			if(modvalues.get(i - 1) == a) System.out.print("(");
			System.out.print(ans.get(i));
		}
		System.out.println(")");
		// int first = a/b;
		// int second=0;
		// int third = 0;
		// System.out.println(first+ "." +second + "(" + third+ ")");

		return len;
	}
}
