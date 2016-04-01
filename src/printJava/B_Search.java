package printJava;
import java.util.Scanner;

public class B_Search {

	public static int binarySearch(int SearchKey, int [] arr){
		int low = 0;
		int high = arr.length-1;
		while(low<=high){
			int mid = (low+high)/2; // or you could write it like that : mid = (low+high) >> 1;
			
			if(arr[mid] == SearchKey)
				return mid;
			else if(arr[mid] > SearchKey)
				high = mid -1;
			else
				low = mid + 1;
		}
		// if the Search key not found will return -1
		return -1;
	}
	public static void main_B_Search() {
		Scanner cin = new Scanner(System.in);
		int [] arr = new int [10];
		int x = 0;
		for (int i = 1; i < 20; i+=2) {
			arr[x] = i;
			System.out.println(arr[x++]+" ");
		}
		
		System.out.println("Enter A Search Key : ");
		int Num = cin.nextInt();
		
		System.out.println("The element "+Num+" found in index : "+binarySearch(Num, arr));
		
	}

}
