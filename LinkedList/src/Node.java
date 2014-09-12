public class Node {
	Node next = null;
	int data;

	public Node(int d) {
		data = d;
	}

	void appendToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		while (n.next != null) {
			n = n.next;  //head update gareko jasto ho
		}
		n.next = end;
	}

	void insertAfter(int key, int data) {
		Node n = this;
		while (n.data != key) {
			n = n.next;
		}
		Node inserted = new Node(8);
		inserted.next = n.next;
		n.next = inserted;
	}

	Node delete(int key, Node head) {
		Node n = this;
		Node m = null;
		while (n.data != key) {
			m = n;
			n = n.next;
		}
		if (m == null) {
			return head.next;
		} else {
			m.next = n.next;
			n.next = null;
			return head;
		}

	}
}
