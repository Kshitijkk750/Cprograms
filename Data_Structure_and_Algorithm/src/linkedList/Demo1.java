package linkedList;
class Node{
	int data;
	Node next;
	
}

public class Demo1 {
	Node head,middle,last;

		void getList() {
			head= new Node();
			middle = new Node();
			last = new Node();
			
			head.data=10;
			middle.data= 20;
			last.data =30;
			
			head.next= middle;
			middle.next= last;
			last.next= null;
		}
		void showList() {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Demo1 d= new Demo1();
		d.getList();
		d.showList();
		
		
		
	}

}
