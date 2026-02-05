package dec_31;

public class MyPriorityQueue {

	int[] arr;
	int rear, front;
	private int ele;

	public MyPriorityQueue(int size) {
		arr = new int[size];
		rear = -1;
		front = -1;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	boolean isEmpty() {
		if (rear == -1)
			return true;
		else
			return false;
	}

	boolean isFull() {
		if ((rear == arr.length - 1 && front == 0) || (rear + 1 == front))
			return true;
		else
			return false;
	}

	void enque(int ele) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}

		if (rear == -1) {
			front = 0;
			rear = 0;
			arr[rear] = ele;
			return;
		}

		int i = rear;

		while (i >= front && arr[i] > ele) {
			arr[i + 1] = arr[i];
			i--;
		}

		arr[i + 1] = ele;
		rear++;
	}

	int deque() {
		if (!isEmpty()) {
			ele = arr[front];
			if (rear == front) {
				rear = -1;
				front = -1;
			} else if (front == arr.length - 1)
				front = 0;
			else
				front++;
		}
		return ele;
	}

	void display() {
		if (isEmpty()) {
			System.out.println("No available cars");
			return;
		}

		for (int i = front; i <= rear; i++) {
			System.out.println(arr[i]);
		}
	}
}
