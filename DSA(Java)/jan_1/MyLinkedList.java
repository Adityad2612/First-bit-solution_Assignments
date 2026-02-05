package jan_1;

public class MyLinkedList {

	Node Start;

	public MyLinkedList() {
		Start = null;
	}

	boolean isEmpty() {
		return Start == null;
	}

	public void insertend(int ele) {
		if (isEmpty()) {
			Start = new Node(ele);
		} else {
			Node temp = Start;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(new Node(ele));
		}
	}

	public void insertbeg(int ele) {
		Node temp = new Node(ele);
		temp.setNext(Start);
		Start = temp;
	}

	public void insertPos(int ele, int pos) {
		if (pos < 1) {
			System.out.println("Invalid position");
			return;
		}

		if (pos == 1) {
			insertbeg(ele);
			return;
		}

		Node temp = Start;
		int c = 1;

		while (temp != null && c < pos - 1) {
			temp = temp.getNext();
			c++;
		}

		if (temp == null) {
			System.out.println("Invalid position");
			return;
		}

		Node temp1 = new Node(ele);
		temp1.setNext(temp.getNext());
		temp.setNext(temp1);
	}

	public void deletePos(int pos) {
		if (isEmpty()) {
			System.out.println("Linked list is empty");
			return;
		}

		if (pos == 1) {
			Start = Start.getNext();
			return;
		}

		Node temp = Start;
		int c = 1;

		while (temp.getNext() != null && c < pos - 1) {
			temp = temp.getNext();
			c++;
		}

		if (temp.getNext() == null) {
			System.out.println("Invalid position");
			return;
		}

		temp.setNext(temp.getNext().getNext());
	}

	void deleteBeg() {
		Node temp = Start;
		if (isEmpty()) {
			System.out.println("List is empty");
		} else {
			Start = Start.getNext();
		}
	}

	void deleteEnd() {
		Node temp = Start;
		if (isEmpty()) {
			System.out.println("List is empty");
		} else {
			if(Start.getNext() == null)
			{
				Start = null;
				return;
			}
			while (temp.getNext().getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Linked list is empty");
			return;
		}

		Node temp = Start;
		while (temp != null) {
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		}
		System.out.println("null");
	}
}
