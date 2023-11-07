package circularDoublyLinkedList;

class Node{
	int data;
	Node next;
	Node prev;
	
}
public class Demo1_CDLL {
	Node head=null;
	
		void addFirst(int val) {
			Node newNode= new Node();
			newNode.data=val;
			if(head==null) {
				newNode.next=newNode;
				newNode.prev=newNode;
				head=newNode;
			}
			else {
				Node last=head;
				while(last.next!=head) {
					last=last.next;
				}
				last.next=newNode;
				newNode.prev=null;
				newNode.next=head;
				//head.prev=last;
				//head.next=newNode;
				head=newNode;
			}
		}
		
		void addLast(int val) {
			
		}
		
		void print() {
			Node temp=null;
			Node last=null;
			if(head==null) {
				System.out.println("Empty Node...");
			}
			else {
				temp=head;
				
			}
			do {
				System.out.println(temp.data);
				if(temp.next==head) {
					head=temp;
					last=temp.prev;
					temp.next=head;
					temp.prev=last;
					last.next=head;
					
				}
				temp=temp.next;
			}while(temp!=head);
			System.out.println(last.next.data);
			
		}
	

	public static void main(String[] args) {
		Demo1_CDLL d= new Demo1_CDLL();
		
		d.addFirst(10);
		d.addFirst(20);
		d.addFirst(30);
		d.print();
		
	}

}
