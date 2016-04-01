package printJava;

/*
 * Topic : A Method getArray that Create And Return Array 2D
 *           ,A Method Sum that Returns The Summation Of The Array 2D
 *           and A Method That Print The Minimum and The Maximum
 *

 */
import java.util.Scanner;

public class ARRAY_Td {
    private Scanner cin = new Scanner(System.in);
    private int arr [][];
        public int [][] getArray(){
               System.out.println("Enter The Number Of Rows");
            int row = cin.nextInt();
               System.out.println("Enter The Number Of Columns");
            int col = cin.nextInt();
            arr = new int [row][col];
            System.out.printf("The The Element Of The Array[%d][%d].\n",arr.length,arr[0].length);
             for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = (int)(Math.random() * 100);
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

              return arr;
        }

        public int sum(int [][] arr){
            int tot = 0;
             for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                tot+= arr[i][j];
            }}
            return tot;
        }

        public void min_Max(int arr[][]){
            int min = arr[0][0],max = arr[0][0];
            for (int[] is : arr) {
                for (int i : is) {
                    if(min > i)
                        min =i;
                    if(max<i)
                        max = i;
                }
            }
                           System.out.printf("The minimum Value  = %d\tThe Maximum Value = %d .", min,max);
        }

        public ARRAY_Td(){
            int arr[][] =getArray();
            System.out.println("The Result Of Summation : "+sum(arr));
            min_Max(arr);
        }

        public static void main(String[] args){
        new ARRAY_Td();
        }
}
