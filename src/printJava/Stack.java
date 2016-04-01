package printJava;

/*
 * Author : nady sopieh shalaby
 * 
 * topic : Complete Methods For Stack 
 * 
 * Language : (Java)
 * 
 * */
public class Stack {
      private int  arr [] ;
      private int length;
      private int Size;
      private int min = 999999999;
      public Stack(int Size) {
    	  this.Size = Size;
    	  arr = new int [Size];
    	  length = -1;
      }
      public void push (int element){
    	  arr[++length] = element;
    	  if(min>arr[length])
    		  min = arr[length];
      }
      public int size (){
    	  return length+1;
      }
      public int pop (){
    	  return arr[length--];
      }
      public int peek(){
    	  return arr[length];
      }
      public boolean isEmpty(){
    	  return length==-1;
      }
       public boolean isFull(){
    	   return length == Size-1;
       }
       
       public int minElement(){
    	   return min;
       }
       public static void main_Stack() {

		Stack stk = new Stack(10);
		stk.push(7);
		stk.push(6);
		stk.push(10);
		stk.push(16);
		stk.push(10);
		stk.push(3);
		stk.push(1);
		stk.push(9);
		stk.push(10);
		stk.push(12);
		System.out.print("The First Poped Element  : ");
		
		System.err.println(stk.pop());
		
		System.out.print("The Second Poped Element  : ");

		System.err.println(stk.pop());
		
		System.out.print("The Peeked Element  : ");
		
		System.err.println(stk.peek());
		
		System.out.print("the Size Of The Stack : ");
		
		System.err.println(stk.size());
		
		System.out.print("the Empty Check Of  Stack : ");
		
		System.err.println(stk.isEmpty());
		
		System.out.print("the Full Check Of  Stack : ");
		
		System.err.println(stk.isFull());
		
		System.out.print("the Minimum Element in Stack : ");
		
		System.err.println(stk.minElement());
	}

}
