package printJava;
/*
 * Author : nady shalaby
 * 
 * topic : BST (Advanced BinaryTree Implementation ) (java)
 * 
 * insert , find , traversal display(in order ,pre order , post order ) , minimum , maximum
 */
//----------------------------node class--------------------------
class Node{
	int iData;
	String sData;
	Node leftChild = null;
	Node rightChild = null;
	
	public Node(int iData,String sData) {
		this.iData = iData;
		this.sData = sData;
	}
	
	public String toString(){
		return String.format("  The iData = %d <======> The sData = %s", this.iData,this.sData);
	}
}

// =========================== Binary tree Class ===========================
public class BinaryTree {
 private Node root;
 
 
 //--------------------------- constructor -------------------------------
 public BinaryTree() {
	 this.root = null;
  }
 // -------------------------- insert ------------------------------------
 public void insert(int iData , String sData){
	 Node  newNode = new Node(iData,sData);
	 if(isEmpty()){
		 this.root = newNode;
		 return;
		 }
	 else{
			 Node current = root;		
			 Node parent ;
			 while(true ){
				 parent = current;
				 if(current.iData<iData){
					 current = current.rightChild;
					 if(current == null){
						 parent.rightChild = newNode;
						 return;
					 }
				 }
				 else{
					 current = current.leftChild;
					 if(current == null){
						 parent.leftChild = newNode;
						 return;
					 }
				 }
			 }
	 }
			 
 }
 
 //--------------------------------find---------------------------
 public Node find(int iData){
	 Node current = this.root;
		 while(current != null){
			 if(current.iData == iData)
				 return current;
			 else if(current.iData<iData)
				 current = current.rightChild;
			 else
				 current = current.leftChild;
		 						} 
	 return null;	 
 }
 
 //-------------------------------- in order traversal ---------------------------
	 public void displayInOrder(){
		actualDisplayInOrder(root); 
	 }
	 private void actualDisplayInOrder(Node node){
		 if(node == null)
			 return;	  
		 actualDisplayInOrder(node.leftChild);	
		 System.out.println(node);
		 actualDisplayInOrder(node.rightChild); 
	 }
	 //-------------------------------- pre order traversal --------------------------- 
	 public void displayPreOrder() {
			
		 actualDisplayPreOrder(root);
	 }

	private void actualDisplayPreOrder(Node node){
		 if(node == null)
			 return;	  
		 actualDisplayInOrder(node.leftChild);	
		 actualDisplayInOrder(node.rightChild); 
		 System.out.println(node);
	 }

	 //-------------------------------- post order traversal ---------------------------
	public void displayPostOrder(){
		actualDisplayPostOrder(root);
	}
 
 private void actualDisplayPostOrder(Node node){
		 if(node == null)
			 return;	 
		 System.out.println(node);
		 actualDisplayInOrder(node.leftChild);			
		 actualDisplayInOrder(node.rightChild); 
		 
	 }
 
 //-------------------------------- Minimum ---------------------------

    public Node Minimum(){
    	Node current = root;
    	Node parent = null ;
    	while(current != null){
    		parent = current;
    		current = 	current.leftChild;
    	}
    	return parent;
    }
 //-------------------------------- Maximum ---------------------------

    public Node Maximum(){
    	Node current = root;
    	Node parent = null ;
    	while(current != null){
    		parent = current;
    		current = 	current.rightChild;
    	}
    	return parent;
    }
    //-------------------------------- isEmpty method ---------------------------

	public boolean isEmpty() {
		return this.root == null;
	}


	 //-------------------------------- main method ---------------------------

	public static void main_B_Tree() {
		
	BinaryTree bTree = new BinaryTree();
	bTree.insert(5, "five");
	bTree.insert(4, "four");
	bTree.insert(1, "one");
	bTree.insert(2, "two");
	bTree.insert(3, "three");
	bTree.insert(8, "eight");
	bTree.insert(9, "nine");
	bTree.insert(6, "six");
	bTree.insert(7, "seven");
	
	System.out.println("The Elements of the tree In Order traversal : ");
	bTree.displayInOrder();
	
	System.out.println("The Elements of the tree In Post Order traversal : ");
	bTree.displayPostOrder();
	
	System.out.println("The Elements of the tree In Pre Order traversal : ");
	bTree.displayPreOrder();
	
	System.out.println("The Search For 5  is found as : "+bTree.find(5));
	
	System.out.println("The Minimum node : " + bTree.Minimum());
	System.out.println("The Maximum node : " + bTree.Maximum());
}


	
}

