package linkedList;

class NodeL{
	int data;
	Node next;
}
public class SinglyLinkedList {
	Node head=null;
	
		void addFirst(int val) {
			Node newNode= new Node();
			newNode.data=val;
			newNode.next= head;
			head=newNode;// Shifting of head to new node
			}
		void addLast(int val) {
			Node newNode= new Node();
			newNode.data=val;
			
			if(head==null) {
				head= newNode;
			}
				else {
					Node LastNode=head;
					while(LastNode.next!=null) {
						LastNode=LastNode.next;
						
					}
					LastNode.next=newNode;
					
				}
			
		}
		
		void deleteNode(int val) {
			if(head.data==val) {
				head=head.next;
			}
			else {
				Node temp=head;
				while(temp.next!=null) {
					if(temp.next.data==val) {
						temp.next=temp.next.next;
						break;
					}
					temp=temp.next;
				}
			}
		}
		
		boolean searchNode(int val) {
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
		void printList() {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList n= new SinglyLinkedList();
		n.addFirst(10);
		n.addFirst(20);
		n.addFirst(30);
		n.addFirst(40);
		n.addFirst(50);

		n.printList();
		System.out.println("**************");
		System.out.println("Inserting data in new node.:-");
		n.addLast(80);
		n.printList();
		System.out.println("**************");
		System.out.println("Deleting specific data...");
		n.deleteNode(10);
		n.printList();
		System.out.println(n.searchNode(30));
		
	}

}
