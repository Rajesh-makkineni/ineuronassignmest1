package Search;

public class Selectionsort 
{
	public static void main(String[] args) 
	{
		
		        int[] arr = {54, 255, 96, 10, 70, 67, 37};
		        selectionSort(arr);
		        System.out.println("Sorted array:");
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		    }
		    
		    public static void selectionSort(int[] arr) {
		        int n = arr.length;
		        
		        for (int i = 0; i < n - 1; i++) {
		            int minIndex = i;
		            
		            
		            for (int j = i + 1; j < n; j++) {
		                if (arr[j] < arr[minIndex]) {
		                    minIndex = j;
		                }
		            }
		            
		            
		            swap(arr, i, minIndex);
		        }
		    }
		    
		    public static void swap(int[] arr, int i, int j) {
		        int temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;
		  }
}
