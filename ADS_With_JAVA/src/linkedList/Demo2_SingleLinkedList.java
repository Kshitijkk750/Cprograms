package linkedList;

class KNode{
	int data;
	Node next;
}
public class Demo2_SingleLinkedList {
		Node head=null;
		
		 void addFirst(int val) {
			 Node newNode= new Node();
			 newNode.data=val;
			 newNode.next=head;
			 head=newNode;
			 
		 }
		 
		 void print() {
			 Node temp=head;
			 while(temp!=null) {
				 System.out.println(temp.data);
				 temp=temp.next;
			 }
		 }
	public static void main(String[] args) {
		
		Demo2_SingleLinkedList k= new Demo2_SingleLinkedList();
		
		k.addFirst(10);
		k.addFirst(20);
		k.addFirst(30);
		k.print();
		
	}

}
