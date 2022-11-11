The worst-case condition for bubble sort occurs when elements of the array are arranged in reverse(decreasing) order. O(n^2)

import java.util.Arrays;
public class Main {
    
    public void bubbleSort(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                // System.out.println(Arrays.toString(arr));
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            // System.out.println(" ");
        }
    }
    
    public void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String args[]) {
        Main myObj = new Main();
        
        int arr[] = {2,3,1,2,6,7,99,24,56};
        
        myObj.bubbleSort(arr);
        // myObj.printArray(arr);
        // System.out.print(Arrays.toString(arr));
    }
}


The above function always runs O(n^2) time even if the array is sorted.
It can be optimized by stopping the algorithm if the inner loop didn’t cause any swap. 

void optimizedBubbleSort(int arr[], int n)
{
   int i, j;
   bool swapped;
   for (i = 0; i < n-1; i++)
   {
     swapped = false;
     for (j = 0; j < n-i-1; j++)
     {
        if (arr[j] > arr[j+1])
        {
           swap(arr[j], arr[j+1]);
           swapped = true;
        }
     }
 
     // IF no two elements were swapped
     // by inner loop, then break
     if (swapped == false)
        break;
   }
}


In recursive bubble sort, only the outer loop is made into recursive

void recursiveBubblesort(int arr[], int n)
{
    if (n == 0 || n == 1)
    {
        return;
    }
    for (int i = 0; i < n - 1; i++)
    {
        if (arr[i] > arr[i + 1])
        {
	   swap(arr[i], arr[i + 1]);
        }
    }
    recursiveBubblesort(arr, n - 1);
}