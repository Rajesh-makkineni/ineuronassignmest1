package Search;
import java.util.*;
public class mergesort 
{
	public static void main(String args[])
	{
		int[] arr = {53, 22, 92, 13, 74, 65, 33};
		        mergeSort(arr);
		        System.out.println("Sorted array:");
		        for (int num : arr) 
		        {
		            System.out.print(num + " ");
		        }
		    }
		    
		    public static void mergeSort(int[] arr) 
		    {
		        int n = arr.length;
		        if (n > 1) 
		        {
		            int mid = n / 2;
		            int[] left = new int[mid];
		            int[] right = new int[n - mid];
		            
		            System.arraycopy(arr, 0, left, 0, mid);
		            System.arraycopy(arr, mid, right, 0, n - mid);
		            
		            mergeSort(left);
		            mergeSort(right);
		            merge(arr, left, right);
		        }
		    }
		    
		    public static void merge(int[] arr, int[] left, int[] right)
		    {
		        int i = 0, j = 0, k = 0;
		        
		        while (i < left.length && j < right.length)
		        {
		            if (left[i] <= right[j]) {
		                arr[k++] = left[i++];
		            } else {
		                arr[k++] = right[j++];
		            }
		        }
		        
		        while (i < left.length) 
		        {
		            arr[k++] = left[i++];
		        }
		        
		        while (j < right.length) 
		        {
		            arr[k++] = right[j++];
		        }
		    }
}
