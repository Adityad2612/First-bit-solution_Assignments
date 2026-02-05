package dec_26;

import java.util.Scanner;

public class PostFix { //12+5*2+

	Scanner sc = new Scanner(System.in);
	String str = "12+5*2+";
	int top = -1;
	
	PostFix(int size) {
		top = -1;
	}
	
	private static void postFix(String str) {
		// TODO Auto-generated method stub
		
		char ch,op = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			
			if(op != '+' || op != '-' || op != '*' || op != '/')
			{
				
			}
		}
	}
	

	boolean isFull() {
		if (top == str.length() - 1)
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

	void push(int ele) {
		if (isFull() == false) {
			top++;
			top = ele;
		} else
			System.out.println("Stack overflow");
	}

	int pop() {
		if (isEmpty() == false) {
			int ele = top;
			top--;
			return ele;
		} else
			System.out.println("Stack underflow");

		return -1;
	}

	int peak() {
		if (isEmpty() == false)
			return top;
		else {
			System.out.println("Stack is underflow");
			return -1;
		}
	}
}


