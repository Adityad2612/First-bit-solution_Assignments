package dec_25;

public class Stack {

	int[] arr;
	int top;

	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}

	boolean isFull() {
		if (top == arr.length - 1)
			return true;
		else
			return false;
	}

	boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public void push(int ele) {
		if (isFull() == false) {
			top++;
			arr[top] = ele;
		} else
			System.out.println("Stack overflow");
	}

	public int pop() {
		if (isEmpty() == false) {
			int ele = arr[top];
			top--;
			return ele;
		} else
			System.out.println("Stack underflow");

		return -1;
	}

	public int peak() {
		if (isEmpty() == false)
			return arr[top];
		else {
			System.out.println("Stack is underflow");
			return -1;
		}
	}
}
