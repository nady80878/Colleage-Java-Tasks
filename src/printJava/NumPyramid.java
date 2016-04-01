package printJava;

public class NumPyramid {
	public static void main(String[] args) {
		int count = 1;
		for(int i = 6 ; i>=1 ; --i){
			for(int k=i ; k>=1 ; --k)
				System.out.print("   ");
			int j ;
			for( j = 1; j <= count ; j*=2)
				System.out.print((j<10)? "  "+j: " "+j);
		
			for( int m = count/2; m >=1 ; m/=2)
				System.out.print((m<10)? "  "+m: " "+m);
			count*=2;
			System.out.println();
		}
	
		   
	   
	}

}
