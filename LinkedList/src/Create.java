public class Create {
	public static void main(String[] args) {
		Node head = new Node (5);
		head.appendToTail(6);
		head.appendToTail(7);
		print(head);
		System.out.println("Result time............");
		head.insertAfter(6,8);
		print(head);
		head =head.delete(5,head);
		System.out.println("...............");
	    print(head);
	}
	public static void print(Node head){
		Node n= head;
		if(head==null){
			System.out.println("empty");
			return;
		}
		
		do{
			System.out.println(n.data + " > ");
			n=n.next;
			//head =head.next garna hunna bcoz head will be changed 
		}
			while(n!=null);
		
		
	}
}
