package linkedList;

	class CLNode{
		int data;
		CLNode next;
		
	}
	
public class Demo_CircularLinkedLIst {
	CLNode head;
	
	void addFirst(int val) {
		CLNode newNode= new CLNode();
		newNode.data= val;
		if(head==null) {
			newNode.next=newNode;
			head=newNode;
		}
		else {
			CLNode last=head;
			while(last.next!=head) {
				last= last.next;
			}
			last.next=newNode;
			newNode.next=head;
			head=newNode;
		}
		
	}
	void addLast(int val) {
		CLNode newNode= new CLNode();
		newNode.data= val;
		if(head==null) {
			newNode.next=newNode;
			head=newNode;
		}
		else {
			CLNode last=head;
			while(last.next!=head) {
				last= last.next;
			}
			last.next=newNode;
			newNode.next=head;
			//head=newNode;      *Same as addFirst only this code is removed
		}
	}
	
	void deleteNode(int val) {
		if(head==null)
			return;
		if(head.data==val && head.next==head) {
			head=null;
		
		}
		else if(head.data==val) {
			CLNode temp=head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			temp.next=head.next;
			head=head.next;
		}
		else {
			CLNode temp=head;
			while(temp.next!=head) {
				if(temp.next.data==val) {
					temp.next=temp.next.next;
					break;
				}
				temp=temp.next;
			}
		}
	}
	
	boolean  search(int val) {
		if(head==null) {
			return false;
		}
		CLNode temp=head;
		do {
			temp=temp.next;
		}while(temp!=head);
		return true;
	}
	
	void printList() {
		if(head==null) {
			System.out.println("Empty Node...");
		}
		CLNode temp=head;

		do {
			System.out.println(temp.data);
			temp=temp.next;
		}while(temp!=head);
	}
	public static void main(String[] args) {
		
		Demo_CircularLinkedLIst cll= new Demo_CircularLinkedLIst();
		
		cll.addFirst(20);
		cll.addFirst(30);
		cll.addFirst(40);
		cll.addFirst(10);

		cll.printList();
		cll.addLast(80);
		System.out.println("------------------");
		cll.printList();
		System.out.println("------------------");
		cll.deleteNode(30);
		cll.printList();
		System.out.println("------------------");

		cll.deleteNode(80);
		cll.printList();
		
		System.out.println(cll.search(10));

	}

}
