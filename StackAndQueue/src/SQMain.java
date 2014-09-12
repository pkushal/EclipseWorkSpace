public class SQMain {
	public static void main(String[] args) {
		Stack head = new Stack(); // head bhaneko chai just top position point
									// garne pointer Node jasto ho
		head.push(6); // aba chai, head( or top) le push gareko 6 lai top of
						// stack ma cha bhanera point garcha
		System.out.println("first Peek gareko :  " +head.peek());
		head.push(7);
		System.out.println("Top lai Peek gareko : " +head.peek());
		head.push(8);
		System.out.println("Top lai Peek gareko : " +head.peek());
		head.push(9);
		System.out.println("Top lai Peek gareko : " +head.peek());
		head.pop();
		System.out.println("9 lai Pop gare pachi  Top lai Peek gareko : " + head.peek());
		head.push(10);
		System.out.println("Top lai Peek gareko : " +head.peek());
		head.push(11);
		System.out.println("Top lai Peek gareko : " +head.peek());
		head.push(12);
		System.out.println("Top lai Peek gareko : " +head.peek());
				
		System.out.print("Total stack lai next next garera print gareko : ");
		System.out.println(head);
		
		//aba euta pop gareko
		head.pop();
		System.out.println("12  lai Pop gare pachi  Top lai Peek gareko : " + head.peek());
//		System.out.print("Total stack lai next next garera print gareko : ");
//		head.print();
//		System.out.println("Top lai Peek gareko : " +head.peek());
	}

	public static void print(Stack head) {

	}
}
