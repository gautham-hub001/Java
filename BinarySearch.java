public class BinarySearch {
    public static void main(String args[]) {
        int[] arr = {1,2,3,45,99,200,1341};
        System.out.println(binarySearch(arr, 45, 0, 6));
    }

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
}
