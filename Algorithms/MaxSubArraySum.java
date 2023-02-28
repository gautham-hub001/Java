package Algorithms;

// kadane's algorithm is used
public class MaxSubArraySum {
    int kadane(int []arr, int N) { // Initializing curSum to 0 and maxSum to min value, denoting an empty subarray
        int curSum = 0;
        int maxSum = arr[0];
        for(int i = 0; i<N ; i++) {
             curSum = curSum + arr[i]; // Taking the max of maxSum and the curSum of the subarray
             maxSum = Math.max(maxSum,curSum);
             // Checking if the curSum becomes negative
             if(curSum < 0)
                 curSum = 0;
         }
        return maxSum;
    }

    public static void main(String[] args) {
        MaxSubArraySum obj = new MaxSubArraySum();
        int[] arr = {-1, 2, -2, 5, 7, -3, 1};
        System.out.println(obj.kadane( arr, arr.length));
    }
}
