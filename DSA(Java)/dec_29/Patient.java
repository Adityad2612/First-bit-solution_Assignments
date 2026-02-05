package dec_29;

public class Patient {
	
	String[] arr;
	int rear,front;
	String str;

	public Patient(int size) {
		arr = new String[size];
		rear = -1;
		front = -1;
	}
	
	public String[] getArr() {
		return arr;
	}

	public void setArr(String[] arr) {
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

	boolean isEmpty()
	{
		if(rear == -1)
			return true;
		else
			return false;
	}
	
	boolean isFull()
	{
		if((rear == arr.length-1 && front == 0) || (rear + 1 == front))
			return true;
		else 
			return false;
	}
	
	void enque(String ele)
	{
		if(!isFull())
		{
			if(rear == -1)
			{
				rear = 0;
				front = 0;
			}else if(rear == arr.length -1)
				rear = 0;
			else
				rear++;
				arr[rear] = ele;
		}
	}
	
	String deque()
	{
		if(!isEmpty())
		{
			str = arr[front];
			if(rear == front) {
				rear = -1 ;
				front = -1;
			}else if(front == arr.length-1)
				front = 0;
			else
				front++;
		}
		return str;
	}
	
	boolean display()
	{
		int i = front;
		while(i!= rear)
		{
			System.out.println(arr[i]);
			if(i == arr.length -1)
				i = 0;
			else
				i++;
		}
		System.out.println(arr[i]);
		return false;
	}

}
