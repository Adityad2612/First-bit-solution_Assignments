package jan_1;

public class MyLinkedListCount {

	Node Start;
	int count = 0;

	public MyLinkedListCount() {
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
		count++;
	}

	public void insertbeg(int ele) {
		Node temp = new Node(ele);
		temp.setNext(Start);
		Start = temp;
		count++;
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
		count++;
	}

	public void deletePos(int pos) {
		if (isEmpty()) {
			System.out.println("Linked list is empty");
			return;
		}

		if (pos == 1) {
			Start = Start.getNext();
			count--;
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
		count--;
	}

	void deleteBeg() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		Start = Start.getNext();
		count--;
	}

	void deleteEnd() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}

		if (Start.getNext() == null) {
			Start = null;
			count--;
			return;
		}

		Node temp = Start;
		while (temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(null);
		count--;
	}

	void isPrimeNumber() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}

		Node temp = Start;
		System.out.println("Prime numbers are:");

		while (temp != null) {
			int num = temp.getData();

			if (num > 1) {
				boolean flag = true;

				for (int i = 2; i <= num / 2; i++) {
					if (num % i == 0) {
						flag = false;
						break;
					}
				}

				if (flag) {
					System.out.println(num);
				}
			}
			temp = temp.getNext();
		}
	}

	void sortingAscending() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}

		for (int i = 0; i < count - 1; i++) {
			Node current = Start;

			for (int j = 0; j < count - i - 1; j++) {
				if (current.getData() > current.getNext().getData()) {
					int temp = current.getData();
					current.setData(current.getNext().getData());
					current.getNext().setData(temp);
				}
				current = current.getNext();
			}
		}
	}

	void sortingDescending() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}

		for (int i = 0; i < count - 1; i++) {
			Node current = Start;

			for (int j = 0; j < count - i - 1; j++) {
				if (current.getData() < current.getNext().getData()) {
					int temp = current.getData();
					current.setData(current.getNext().getData());
					current.getNext().setData(temp);
				}
				current = current.getNext();
			}
		}
	}

	void recursive(Node temp) {
		if (temp != null) {
			recursive(temp.getNext());
			System.out.println(temp.getData() + "- >");
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

	public int size() {
		return count;
	}

}
