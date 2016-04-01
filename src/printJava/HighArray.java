package printJava;
/*
 * Author : nady sopieh shalaby
 * 
 * topic : Complete Methods For High and ordered Array (Updated) 
 * 
 * Language : (Java)
 * 
 * */
public class HighArray {
    int arr[] = new int[100];
   int i = 0;
   //==============================Insert Method========================
  
   public void Insert(int Num){
	   arr[i]=Num;
	   i++;
   }
   
   //=====================Insert Method For Sorted Array==================
   
   public void InsertForSortedArray(int Num){
	   int j;
	   for(j=0 ; j<i ; ++j)
	   {
		   if(Num< arr[j])
		   {
			   for(int k=i;k>j;--k)
			   {
				   arr[k]=arr[k-1];
		       }
			   break;
		   }
	   }
	   arr[j]=Num;
	   i++;
   }
  
   //==============================Search Method========================

   public int Search(int SearchKey){
	   for(int j=0;j<i;++j){
		   if(SearchKey==arr[j])
			   return j;
	   }
	   return -1;
   }
   
   //================Binary Search Method For Sorted Array================

   public int BinarySearch(int SearchKey){
	  int low =0;
	  int high = i - 1;
	  while(low<=high){
		  int mid = (low+high)/2;
		  if(arr[mid]==SearchKey)
			  return mid;
		  else if(arr[mid]<SearchKey)
			  low = mid+1;
		  else
			  high = mid-1;
	  }
	  
	// return -1 if the element not found
	  
	  return -1; 
   }

   //=================Delete Method For All Similar Elements ==============

   public void DeleteSimilarElements(int DeleteKey){
	   int j=0,l;
	   boolean f =false;
	   for(;j<i;++j)
	   {
		   if(DeleteKey==arr[j])
		   {
				   f= true;
				   for(l=j;l<i;++l)
				   {
					   arr[l]=arr[l+1];
				   }
				   j--;
				   i--;
			}	 
	   }
	   if(!f)
		   System.out.println("Delete Key Not found");  
      }
   
 //====================Delete Method For One Element ===================
   
   public void DeleteElement(int DeleteKey){
   int pivot=0;
   int j=0;
   for(;j<i;++j){
   if(DeleteKey==arr[j])
          {
		   pivot=j;
		   break;
          }
                }
   if(j==i){
	   System.out.println("Delete Key Not found");
	   return;
   }
   for(j=pivot;j<i;++j){
           arr[j]=arr[j+1];
   }
   i--;
   }
   //==========================Bubble Sort Method========================
   public void BubbleSort(){
	   for(int j=i-1;j>0;--j){
		   for(int k=0;k<j;++k){
			   if(arr[k]>arr[k+1]){
				   int temp = arr[k];
				   arr[k]=arr[k+1];
				   arr[k+1]=temp;
			   }
		   }
	   }
   }
   
   //==========================Selection Sort Method======================
   public void SelectionSort(){
	   for(int j=0;j<i-1;++j){
		   int min = j,k;
		   for(k=j+1;k<i;++k)
			   if(arr[min]>arr[k]){
				  min = k;
			   }
		   int temp = arr[min];
		   arr[min]=arr[j];
		   arr[j]=temp;
	   }
   }
   //==========================Insertion Sort Method======================
   public void InsertionSort(){
	   for(int j=1;j<i;++j){
		   int min = j;
		   while(min>0 && arr[min]<arr[min-1]){
		   int temp = arr[min];
		   arr[min]=arr[min-1];
		   arr[min-1]=temp;
		   min--;}
	   }
   }
   //==============================Display Method========================
   
   public void Display(){
	   for(int j=0;j<i;++j)
		  System.err.print(arr[j]+"  ");    
	     System.out.println();
		  }
   //==============================Main Method==========================
	public static void main_HighArray() {
    HighArray ar = new HighArray();
    ar.Insert(3);
    ar.Insert(6);
    ar.Insert(2);
    ar.Insert(7);
    ar.Insert(7);
    ar.Insert(10);
    ar.Insert(11);
    ar.Insert(12);
    ar.Insert(7);
    ar.Insert(8);
    ar.Insert(9);
    System.out.println("the array elements : ");
    ar.Display();
    ar.InsertForSortedArray(5);
    ar.DeleteSimilarElements(7);
    System.out.println("the array elements after deletion element 7: ");
    ar.Display();
    
    System.out.println("the search for element 5 : ");
    int res = ar.Search(5);
       
    if(res!=-1)
    	System.out.println("the element 5 found in the position : "+res);
    
    System.out.println("the Binary search for element 12 : ");
    res = ar.BinarySearch(12);
    if(res!=-1)
    	System.out.println("the element 8 found in the position : "+res);
    
    System.out.println("the Bubble Sort for The Array : ");
    ar.BubbleSort();
    ar.Display();  
    System.out.println("the Selection Sort for The Array : ");
    ar.SelectionSort();
    ar.Display();
    System.out.println("the Insertion Sort for The Array : ");
    ar.InsertionSort();
    ar.Display();
    	
    }
}
