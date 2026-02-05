package jan_7;

public class MyDoublyLinkedList<T> {

	Node<T> start;
	Node<T> end;

	public MyDoublyLinkedList(Node<T> start, Node<T> end) {
		super();
		this.start = start;
		this.end = end;
	}

	int count = 0;

	boolean isEmpty() {
		if (start == null) {
			return true;
		} else
			return false;
	}

//	void insert(int ele, int pos) {
//		Node temp1 = new Node(ele);
//		if (isEmpty()) {
//			Start = temp1;
//			End = temp1;
//		} else if (pos == 1) {
//			temp1.setNext(Start);
//			Start.setPrev(temp1);
//			Start = temp1;
//		} else {
//			Node temp = Start;
//			int c = 1;
//			while (c < pos - 1) {
//				temp = temp.getNext();
//				c++;
//			}
//			if (temp == End) {
//				temp1.setPrev(temp);
//				temp.setNext(temp1);
//				End = temp1;
//				count++;
//				return;
//			}
//			temp1.setNext(temp.getNext());
//			temp1.setPrev(temp);
//			temp.getNext().setPrev(temp1);
//			temp.setNext(temp1);
//		}
//		count++;
//	}

	void insertOpti(T ele, int pos) {
		Node<T> temp1 = new Node<T>(ele);
		if (isEmpty()) {
			start = temp1;
			end = temp1;
			return;
		} else if (pos == 1) {
			temp1.setNext(start);
			start.setPrev(temp1);
			start = temp1;
			return;
		}
		int mid;
		Node<T> itr;
		mid = count / 2;
		if (pos < mid) {
			itr = start;
			for (int i = 0; i < pos - 1; i++) {
				itr = itr.getNext();
			}
		} else {
			itr = end;
			for (int i = count; i >= pos; i--) {
				itr = itr.getPrev();
			}
		}
		temp1.setNext(itr.getNext());
		temp1.setPrev(itr);
		itr.getNext().setPrev(temp1);
		itr.setNext(temp1);
		count++;

	}

	void insertAtLast(T ele) {
		Node<T> temp1 = new Node<T>(ele);

		if (isEmpty()) {
			start = temp1;
			end = temp1;
		} else {
			end.setNext(temp1);
			temp1.setPrev(end);
			end = temp1;
		}
		count++;
	}

	void delete(int pos) {
		if (isEmpty())
			return;
		if (pos > count)
			return;

		if (pos == 1) {
			start = start.getNext();
			start.setPrev(null);
			count--;
			return;
		}

		if (pos == count) {
			end = end.getPrev();
			end.setNext(null);
			count--;
			return;
		} else {
			Node<T> temp = start;
			int c = 1;
			while (c < pos) {
				c++;
				temp = temp.getNext();
			}
			temp.getPrev().setNext(temp.getNext());
			temp.getNext().setPrev(temp.getPrev());
			count--;
		}
	}

	void displayFwd() {
		Node<T> temp = start;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

	void displayBack() {
		Node<T> temp = end;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getPrev();
		}
	}
}
