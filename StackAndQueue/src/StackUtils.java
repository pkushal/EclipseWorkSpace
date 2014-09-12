import java.util.Stack;


public class StackUtils {
	static Stack<Integer> stackFromJava = new Stack<Integer>();
	
	public static void main(String[] args) {
		stackFromJava.push(1);
		stackFromJava.push(2);
		stackFromJava.push(3);
		stackFromJava.push(4);
		stackFromJava.push(41);
		stackFromJava.push(21);
		System.out.println(stackFromJava);
	}
}
