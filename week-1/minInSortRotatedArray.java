
public class minInSortRotatedArray {
    public  static int findMin(int[] nums) {
        int n=nums.length;
        int i=0,j=n-1;
        while(i<j&&i>=0&&j<n){
            int mid=i+(j-i)/2;
           if (nums[mid]>nums[j]){
            i=mid+1;
           }
           else{
            j=mid;
           }
        }
        return nums[i];
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Minimum in rotated sorted array: " + findMin(nums));
    }

}