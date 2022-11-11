import java.util.ArrayList;

public class RecursionBasics {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(sumOfDigits(12345));
        System.out.println(productOfDigits(123));
        reverseNum(1234);
        System.out.println();

        reverseNumUsingExternalVariable(1234);
        System.out.println(reverseNum);

        System.out.println(reverseNumReturned(12345)); // imp

        System.out.println(palindrome(12321));
        System.out.println(palindromeUsingRecursion(12321));

        System.out.println(numberOfZeroes(909900870));

        int[] arr = {1,2,3,4,99,4,3,4};
        linearSearchAllOccurences(arr, 4, 0);
        System.out.println(ans);

        System.out.println(linearSearchAllOccurencesReturned(arr, 4, 0, new ArrayList<>()));
        System.out.println(linearSearchAllOccurencesReturnedWithoutUsingArg(arr, 4, 0));

        int[] arr2 = {3,4,5,6,7,8,1};
        System.out.println(binarySearchInRotatedArray(arr2, 1, 0, arr2.length-1));
    }
    static int fact(int n) {
        if(n<=1) {
            return 1;
        }
        return n* fact(n-1);
    }
    static int sumOfDigits(int n) {
        if(n==0) {
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
    static int productOfDigits(int n) {
        if(n%10==n) { // single digit
            return n;
        }
        return n%10 * productOfDigits(n/10);
    }

    static void reverseNum(int n) {
        if(n== 0) {
            return;
        }
        System.out.print(n%10);
        reverseNum(n/10);
    }
    static int reverseNum = 0;
    static void reverseNumUsingExternalVariable(int n) {
        if (n==0) {
            return;
        }
        reverseNum = reverseNum*10 + n%10;
        reverseNumUsingExternalVariable(n/10);
    }
    static int reverseNumReturned(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    private static int helper(int n, int digits) {
        if(n%10 == n) { //** This condition is used to check if the number is single digit number
            return n;
        }
        return (n%10)*(int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }

    static boolean palindrome(int n) {
        return n==reverseNumReturned(n);
    }

    static boolean palindromeUsingRecursion(int n) { // imp
        String num = String.valueOf(n);
        return palinHelper(num);
    }
    private static boolean palinHelper(String num) {
        if(num.length()<=1){
            return true;
        }
        return num.charAt(0)==num.charAt(num.length()-1) && palinHelper(num.substring(1, num.length()-1)); //***
    }

    //** imp
    // passing final level value to highest level function call
    static int numberOfZeroes(int n) {
        return numberOfZeroesHelper(n, 0);
    }
    static int numberOfZeroesHelper(int n, int count) {
        if(n==0)
            return count;
        if(n%10==0)
            return numberOfZeroesHelper(n/10, count+1);
        return numberOfZeroesHelper(n/10, count);
    }

    static ArrayList<Integer> ans = new ArrayList<>();
    static void linearSearchAllOccurences(int[] arr, int target, int curr_index) {
        if(curr_index == arr.length)
            return;
        if(arr[curr_index] == target)
            ans.add(curr_index);
        linearSearchAllOccurences(arr, target, curr_index + 1);
    }

    static ArrayList linearSearchAllOccurencesReturned(int[] arr, int target, int curr_index, ArrayList<Integer> list) {
        if(curr_index == arr.length)
            return list;
        if(arr[curr_index] == target)
            list.add(curr_index);
        return linearSearchAllOccurencesReturned(arr, target, curr_index + 1, list);
    }

    static ArrayList linearSearchAllOccurencesReturnedWithoutUsingArg(int[] arr, int target, int curr_index) { // vvv Imp concept
        // or static ArrayList<Integer> linearSearchAllOccurencesReturnedWithoutUsingArg
        ArrayList<Integer> list = new ArrayList<>();
        if(curr_index == arr.length)
            return list; // after the last element, it will return an empty list
        if(arr[curr_index] == target)
            list.add(curr_index);
        list.addAll(linearSearchAllOccurencesReturnedWithoutUsingArg(arr, target, curr_index + 1));
        return list;
    }

    static int binarySearchInRotatedArray(int[] arr, int target, int start, int end){ // v  imp
        // rotated array is nothing but rotated sorted array.
        // In rotated sorted array, either start to mid is sorted or mid+1 to end is sorted
        // [3,4,5,6,7,8,1,2]. Here, mid is 6. start to mid is sorted but not mid+1 to end.
        if(start > end) // element is not present
            return -1;
        int mid = start + (end-start)/2;
        if(arr[mid] == target)
            return mid;
        if(arr[start] <= arr[mid]) { // This means start till mid is sorted
            if(target >= arr[start] && target <= arr[mid]) { // target is between start till mid
                return binarySearchInRotatedArray(arr, target, start, mid-1);
            }
            return binarySearchInRotatedArray(arr, target, mid+1, end); // target is between mid+1 till end
        } 
        else{ // This means mid+1 till end is sorted
            if(target >= arr[mid+1] && target <= arr[end]) { // target is between mid+1 till end
                return binarySearchInRotatedArray(arr, target, mid+1, target);
            }
            return binarySearchInRotatedArray(arr, target, start, mid-1); // target is between start till mid
        }
    }
}
