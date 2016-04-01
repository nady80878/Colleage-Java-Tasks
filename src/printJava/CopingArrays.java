package printJava;

import java.util.Arrays;

public class CopingArrays {

	public static void main_CopingArrays() {
    int arr [] = new int [10];
    int arr2 [] = new int [10];
    for(int i =0 ; i< arr.length;++i){
    	arr[i] = i;

    }
    
     arr2= Arrays.copyOfRange(arr, 1, 10);
     
     for(int x : arr2)
    System.out.println(x);
	}

}
