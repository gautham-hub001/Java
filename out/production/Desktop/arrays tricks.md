Arrays.toString(arr);

int[] arr = new int[2*n];

Arrays.fill(arr, -1); // initialises entire array are with -1


Note: If an array is passed to a function call then the array object is same and both the reference variables point to the same object. Similarly, if an array is passed to a function and it has recursion then all the function calls refer to the same object and if any one of them modifies the array then it is modified in future recursion calls also.