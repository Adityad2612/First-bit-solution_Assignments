package jan_7;

public class Node<T> {

	T data;
	Node<T> next;
	Node<T> prev;

	Node(T ele) {
		data = ele;
		next = null;
		prev = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

}
