package dec_25;

public class TextEditor {

	String[] arr;
	int top;

	public TextEditor(int size) {
		arr = new String[size];
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

	public void push(String str) {
		if (isFull() == false) {
			top++;
			arr[top] = str;
		} else
			System.out.println("Stack overflow");
	}

	public String pop() {
		if (isEmpty() == false) {
			String str = arr[top];
			top--;
			return str;
		} else
			System.out.println("Stack underflow");

		return null;
	}

	public String peak() {
		for (int i = arr.length - 1; i>=0; i--) {
			System.out.println(arr[top--]);
		}
		return null;
		}
	}
