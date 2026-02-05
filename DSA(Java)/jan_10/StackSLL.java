package jan_10;

public class StackSLL {

	Node top;

	public StackSLL() {
		top = null;
	}

	boolean isEmpty() {
		return top == null;
	}

	public void push(int ele) {
		Node newNode = new Node(ele);
		newNode.next = top;
		top = newNode;
		System.out.println(ele + " pushed into stack");
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}

		int val = top.data;
		top = top.next;
		return val;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return top.data;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}

		Node temp = top;
		System.out.print("Stack elements: ");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
