package stack;
class Mstack{
	final int size=5;
	int arr[] = new int[size];
	int top=-1;
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else {
		return false;
	}
		}
	public boolean isFull() {
		if(top==size-1)
			return true ;
		else
			return false ;
	}
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack is Full...");
			
		}
		else {
			++top;
			arr[top]=value ;
			System.out.println("value is pushed..");
								
		}
	}
	public void Pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			
		}
		else {
			System.out.println("Value is popped..");
			top--;
			
		}
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty...");
		}
		else {
			System.out.println("Peek eement is :" + arr[top]);
		}
		return 0;
	}
	}

public class Push_Pop {

	public static void main(String[] args) {
		
		Mstack stack= new Mstack();
		stack.push(10);
		System.out.println("10 is pushed");
		stack.push(20);
		System.out.println("20 is pushed");
		stack.push(30);
		System.out.println("30 is pushed");
		stack.Pop();
		System.out.println("value is popped..");
		stack.peek();
		//System.out.println(ArraystoString(stack.arr));
		
		
		
	}

}
