1. Smallest element greater than or equal to target in the given sorted array

Or

Find the ceil of target in the given sorted array

Can be solved using binary search logic because binary search condenses the search space to the closest value to the target

// For non-decreasing array

public static int binarySearch(int[] arr, int target, int l, int r) {

	// edge case: if target element is greater than all the elements in the array, then answer 			does not exist
	if(target > arr[arr.length - 1]) 
		return -1;
        if(l>r) {
	    // next big element when target is not in the array 
            return l; 
        }
        int mid = l + (r-l)/2;
        if(arr[mid] == target) {
            return mid; // if target is in the array, return target itself
        }
        if(arr[mid] < target) {
            return binarySearch(arr,target, mid+1,r);
        }
        return binarySearch(arr, target, l, mid-1);
}




2. Greatest element less than or equal to target in the given sorted array

Or

Find the floor of target in the given sorted array

Can be solved using binary search logic because binary search condenses the search space to the closest value to the target


public static int binarySearch(int[] arr, int target, int l, int r) {
	// no extra code needed here because by default it will return -1 (0-1 = -1)
        if(l>r) {
	    // when target is not in the array 
            return r; // only difference from binarySearch
        }
        int mid = l + (r-l)/2;
        if(arr[mid] == target) {
            return mid; // if target is in the array, return target itself
        }
        if(arr[mid] < target) {
            return binarySearch(arr,target, mid+1,r);
        }
        return binarySearch(arr, target, l, mid-1);
    }

