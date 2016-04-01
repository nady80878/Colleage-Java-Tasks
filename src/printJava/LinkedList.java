package printJava;


class Link {
    public String book ;
    private int bage;
    public Link next;

    public Link(String book , int bage){
        this.book = book;
        this.bage = bage;
    }

    public void display(){
        System.out.println( "the book : " +book+"    the bage : " +bage);
    }
    @Override
    public String toString(){
        return book;
    }
}
public class LinkedList {
	public static void main_LinkedList() {
		LinkedList lnk = new LinkedList();
		lnk.insert("nady", 1);
		lnk.insert("hadeer", 2);
		lnk.insert("ahmed", 3);
		lnk.insert("gamal", 4);
		
		lnk.display();
		
		lnk.removeFirst();
		lnk.display();
		
		lnk.remove("hadeer");
		
		lnk.display();
		
		System.out.println("the find : "+lnk.find("ahmed"));
	}
	
	
	
	
	
 private Link firstLink;

    public LinkedList() {
    this.firstLink = null;
    }

    public void insert (String book , int bage){
        Link newLink = new Link(book,bage);
       newLink.next = this.firstLink;
       firstLink= newLink;

    }

    public boolean isEmpty(){
        return this.firstLink == null;
    }
    public Link removeFirst(){
        Link linkReference = this.firstLink;
        if(!isEmpty()){
            firstLink = firstLink.next;
        }
        return linkReference;
    }

    public void display(){
      Link theLink = this.firstLink;

      while(theLink != null){
          theLink.display();
          theLink = theLink.next;

          System.out.println();
      }
    }
    public Link find(String book){
    	Link theLink = this.firstLink;
    	if(!isEmpty()){
    	while(theLink.book != book){
    		if(theLink.next == null)
    			return null;
    		else
    			theLink = theLink.next;
    		}
    	}
    	else 
    		System.out.println("The Linked list Is Empty");
    	return theLink;  	
    }
    
    public Link remove(String book){
    	Link currentLink = this.firstLink;
    	Link prevLink = this.firstLink;
    	
    	if(!isEmpty()){
    		while(currentLink.book != book){
    			if(currentLink.next == null)
    				return null;
    			else{
    				prevLink = currentLink;
    				currentLink = currentLink.next;
    			}
    		}
    	}else 
    		System.out.println("The Linked list Is Empty");
    	if(currentLink == firstLink)
    		firstLink = firstLink.next;
    	else{
    		prevLink.next = currentLink.next;
    	}
    	return currentLink;		
    }
 

}
