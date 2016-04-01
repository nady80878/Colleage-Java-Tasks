package printJava;


/*
 Author : nady shalaby
 *
 Topic  : A Method To Do Task And return The Result
 */
public class Method_Section {

    public static int sumRange(int start , int end){
        int sum=0;
        for(;start<=end;++start){
            sum+=start;
        }
        return sum;
    }
	public static void main_Method_Section() {
      System.out.println(sumRange(23,50));
   }
}
