package printJava;
/*
 * Author : nady shalaby
 * 
 * topic : how to print Multiplication Table
 */
public class MultiplicationTable {
public MultiplicationTable() {
	for(int i = 1 ; i <= 12 ; ++i){
		for(int j = 1 ; j <= 12 ; ++j){
			System.out.println(String.format("%d * %d = %d", i,j,i*j));
		}
		System.out.println();
	}
}
public static void main_MultiplicationTable() {
     new MultiplicationTable();
	}

}
