Recursion is function calling itself

Function calls are maintained in a stack so that functions continue their instructions only after the functions top of it return after their execution.

If there is no termination condition then the function calls itself over and over until the stack memory is full which gives rise to stack overflow error.

Recursion solutions can be converted into for loop/while loop

Recursion solutions are converted to iteration to optimise it because recursion takes more space complexity (recursive calls) and also sometimes for loop takes less time too because for example, in fibonacci problem there will be extra function calls whereas in for loop solution it is significantly less.

Termination condition if it is a bottom to top problem
Base condition if it is a top to bottom problem.


Stack memory initially has main function in it  and on top of it all the function calls will be pushed subsequently.


Steps in solving:
1. Check if the problem can be divided into sub-problems.
2. Write a recurrence relation if possible.
3. Draw recurrence tree.
4. Debug the solution.

Very very very important:
Deciding which variables go into:
1. Arguments - variables which are needed for future function calls.
2. Body of the function - variables which can be computed and which are not needed by future function calls
3. Return type

Very very important:
If your recursion function is returning a value then make sure to add return statement infront of sub-recursion calls inside the function.


Types of recurrence relations:
1. Linear
2. Divide & conquer

Problems

1. Problems.Fibonacci.java

public class Problems.Fibonacci {
    public static void main(String args[]) {
        System.out.println(fib(6));
    }
    public static int fib(int n) {
        if(n<=2) {
            return n-1; // should be same datatype (int)
        }
        return fib(n-1) + fib(n-2); // should be same datatype (int)
    }
}


2. BinarySearch.java

public class BinarySearch {
    public static void main(String args[]) {
        int[] arr = {1,2,3,45,99,200,1341};
        System.out.println(binarySearch(arr, 1231, 0, 6));
    }

    public static int binarySearch(int[] arr, int target, int l, int r) {
        if(l>r) {
            return -1; // should be same datatype (int)
        }
        int mid = l + (r-l)/2;
        if(arr[mid] == target) {
            return mid; // should be same datatype (int)
        }
        if(arr[mid] < target) {
            return binarySearch(arr,target, mid+1,r); // should be same datatype (int)
        }
        return binarySearch(arr, target, l, mid-1);
    }
}


Iterative solution

public static int binarySearch(int[] arr, int target, int l, int r) {
        while(l<=r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, r);
            }
            return binarySearch(arr, target, l, mid - 1);
        }
        return -1;
}