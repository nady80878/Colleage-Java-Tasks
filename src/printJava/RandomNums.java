package printJava;

public class RandomNums {

	public static void main(String[] args) {
		
		int min  = 3 ; 
		int max = 60;
		int range = max - min + 1;
		System.out.println(range);
		int num = (int)(Math.random() * range + min);
		System.out.println(num);

	}

}
