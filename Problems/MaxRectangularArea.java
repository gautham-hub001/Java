package Problems;

public class MaxRectangularArea {
    public int maxArea(int[] height) {
        int low=0, high=height.length-1, maxwater=0;
        while(low<high) {
            if(height[low]<height[high]) {
                maxwater = maxwater<height[low]*(high-low)? height[low]*(high-low): maxwater;
                low++;
            }
            else{
                maxwater = maxwater<height[high]*(high-low)? height[high]*(high-low): maxwater;
                high--;
            }
        }
        return maxwater;
    }

    public static void main(String[] args) {
        MaxRectangularArea m = new MaxRectangularArea();
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(m.maxArea(arr));
    }
}