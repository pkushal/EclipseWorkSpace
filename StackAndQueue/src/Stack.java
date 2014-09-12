//Stack using LinkedList

public class Stack {
	Node top;

	Object pop() { // looks like pop garda head ma garcha
		if (top.next!= null) { // top nai null hunu bhaneko ta data nai push gareko
							// chaina bhaneko jasto ho...top affai ta kunai data
							// hoina..pointer jasto ho
			Object item = top.data;
			top = top.next; // eh .. data nikalne bhane pachi top lai update
							// gareko
			return item;
		}
		return null; // top nai null cha bhannu ko meaning kei ni data chaina
						// bhaneko jasto
	}

	void push(Object item) {
		Node t = new Node(item);
		t.next = top; // naya t le purano top bhanne lai point garnu paryo ni ta
		top = t; // top lai update gareko
	}

	Object peek() {
		return top.data;
	}
	
	public String toString(){
		StringBuffer ans = new StringBuffer();
		Node t=top; // print garda top reference lai change garna hunna 
		do {
			ans.append(t.data);
			ans.append(">");
			t = t.next;
		} while (t != null); //last step ma t lai update gari sakeko cha so ahile t!= null matra gare pugcha
		
		return ans.toString();
	}
	
	void print() {
		StringBuffer ans = new StringBuffer();
		Node t=top; // print garda top reference lai change garna hunna 
		do {
			ans.append(t.data);
			ans.append(">");
			t = t.next;
		} while (t != null); //last step ma t lai update gari sakeko cha so ahile t!= null matra gare pugcha
		System.out.println(ans);
	}
}
