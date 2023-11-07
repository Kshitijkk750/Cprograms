package doublyLinkedList;
	class Node{
		int data;
		Node next;
		Node prev;
	}
public class Demo1_DLL {

		Node head=null;
		
		void AddFirst(int val) {
			Node newNode= new Node();
			newNode.data=val;
			
			if(head==null) {
				newNode.next=null;
				newNode.prev=null;
				head=newNode;
			}
			else {
				newNode.prev=null;
				newNode.next=head;
				head.prev=newNode;
				head=newNode;
			}
			
		}
		
		void addLast(int val) {
			Node newNode= new Node();
			newNode.data=val;
			
			if(head==null) {
				newNode.next=null;
				newNode.prev=null;
				head=newNode;
			}
			else {
				Node temp=head;
				while(temp.next!=null) {
					temp=temp.next;
					
				}
				temp.next=newNode;
				newNode.prev=temp;
				newNode.next=null;
				
			}
			
		}
		
		void print() {
			System.out.println("Forward printing..");
			Node temp=head;
			Node last=null;

			while(temp!=null) {
				System.out.println(temp.data);
				if(temp.next==null) {
					last=temp;
				}
				temp=temp.next;

			}
			
			System.out.println("Backward printing...");
			while(last!=null) {
				System.out.println(last.data);
				last= last.prev;
				
			}
			
		}
		
		void delete(int val) {
			if(head==null) {
				return;
			}
			Node temp=head;

			
			
				while(temp !=null && temp.data!=val) {
					temp=temp.next;
				}
				if(temp==null) {
					System.out.println("data not found..");
					System.out.println("------------------");
				}
				else if(temp==head) {
					head=head.next;
					head.prev=null;
				}
				else if(temp.next==null) {
					temp.prev.next=null;
				}
				else {
					temp.prev.next=temp.next;
					temp.next.prev=temp.prev;
				}
				
			}
		
		
		
		boolean searchval(int val) {
			Node temp=head;
			while(temp!=null) {
				if(temp.data==val) {
					return true;
				}
				else {
				temp=temp.next;
				}
				}
			return false;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1_DLL  d= new Demo1_DLL();
		d.AddFirst(10);
		d.AddFirst(20);
		d.print();
		System.out.println("--------------------");
		d.addLast(50);
		d.addLast(60);
		d.print();
		System.out.println("--------------------");
		d.delete(50);
		d.print();
		System.out.println(d.searchval(60)); 
		System.out.println("--------------------");
		
		d.delete(90);
		d.print();

	}

}
