package binary_Practise;


class Node{
	int data;
	Node left;
	Node right;


	public Node(int data) {
	this.data = data;
	this.left = null;
	this.right = null;
}
}
	

public class Practise {

	Node root;
	
	public Node insertNode(Node root, int val) {
		
		if(root==null) {
			return new Node(val);
		}
			else if(root.data<val) {
				root.right=insertNode(root.right,val);
			}
			else {
				root.left=insertNode(root.left,val);
			}
		return root;
		}
	
	public boolean search(Node root,int val) {
		if(root==null) {
			return false;
		}
		 if(root.data==val){
			return true;
		}
		if(root.data<val) {
			return search(root.right, val);
		}
		else 
			return search(root.left, val);
		
		
	}
	
	
	public Node delete(Node root, int val) {
		
		if(root==null)
			return null;
		else if(root.data<val)
			root.right=delete(root.right, val);
		else if(root.data>val)
			root.left= delete(root.left, val);
		else {
			if(root.left==null && root.right==null) {
				return null;
			}
			else if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			else {
				int rightmin=getRightMin(root.right);
				root.data=rightmin;
				root.right=delete(root.right, rightmin);
			}
		}
		return root;
	}
	
	
	private int getRightMin(Node right) {
		Node temp=right;
		while(temp.left!=null) {
			temp=temp.left;}
		
		return temp.data;
		
	}

	public void inorder(Node root) {
		if(root==null) {
			return ;
		}
		else {
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	
	public void postorder(Node root) {
		if(root==null) {
			return ;
		}
		else {
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data);
		}
	}
	
	public void preorder(Node root) {
		if(root==null) {
			return ;
		}
		else {
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
			
		}
	}
	
	
	public static void main(String[] args) {
		Practise bst= new Practise();
		
		bst.root=bst.insertNode(bst.root, 10);
		bst.root=bst.insertNode(bst.root, 20);		
		bst.root=bst.insertNode(bst.root, 30);
		bst.root=bst.insertNode(bst.root, 40);
		bst.root=bst.insertNode(bst.root, 25);

		bst.root=bst.insertNode(bst.root, 35);
		bst.root=bst.insertNode(bst.root, 15);
		bst.root=bst.insertNode(bst.root, 5);
		//System.out.println("Before Deleting...");
		System.out.println("---------------");
		System.out.println(bst.search(bst.root, 10)); 
		System.out.println("---------------");
//		bst.delete(bst.root, 150);
//		System.out.println("After deleting ...");
		System.out.println("-------Inorder--------");

		bst.inorder(bst.root);
		
		System.out.println("-------Postorder--------");

		bst.postorder(bst.root);
		
		System.out.println("-------Preorder--------");
		bst.preorder(bst.root);
				
	}

}


