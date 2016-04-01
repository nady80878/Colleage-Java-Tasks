package printJava;
/*
 * Author : nady sopieh shalaby
 * 
 * Topic : Stop Watch Class (java)
 * 
 * Language : (Java)
 * 
 * */
public class StopWatch {

	private double start ;
	private double stop ;
	
	public StopWatch() {
		this.start = 0;
		this.stop = 0;
	}
	
	public void start (){
		this.start = System.currentTimeMillis();
		
	}
	
	public void stop () {
		this.stop = System.currentTimeMillis();
	}
	
	public double getStart() {
		return start;
	}

	public double getStop() {
		return stop;
	}

	public double getElapcedTime(){
		return this.stop - this.start ;
	}
	public static void main_StopWatch() {

		StopWatch stopWatch = new StopWatch();
		// Initializing The Array
		int arr [] = new int [10000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		stopWatch.start();
		//============selection sort for Array =========
		for(int i = 0 ; i < arr.length - 1 ; ++i){
			int index = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[index] > arr[j])
					index = j;
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		stopWatch.stop();
		System.out.println("The Start Time : "+ stopWatch.getStart());
		//====================printing Array===========
		System.out.println("=======Printing Array After Selection Sort=======");
		for(int x : arr){
			System.out.println(x+" ");
		}
		System.out.println("===========================================");
		System.out.println("The Stop Time : "+ stopWatch.getStop());
		System.out.println("The Elepced Time : " + stopWatch.getElapcedTime());

	}

}
