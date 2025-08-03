public class EqualSumPartition {
    static Boolean[][] dp;

    // Recursive function to check if a subset with the given target sum exists
    public static boolean recursion(int[] nums, int target, int ind, int curr) {
        if (curr == target) return true; // Found a valid subset
        if (ind >= nums.length || curr > target) return false; 

        if (dp[curr][ind] != null) return dp[curr][ind]; 

        // Include current number
        boolean include = recursion(nums, target, ind + 1, curr + nums[ind]);

        // Exclude current number
        boolean exclude = recursion(nums, target, ind + 1, curr);

        // Store result and return
        dp[curr][ind] = include || exclude;
        return dp[curr][ind];
    }

    // Main function 
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;

        // If total sum is odd,
        if (sum % 2 != 0) return false;

        int target = sum / 2;
        int n = nums.length;

        dp = new Boolean[target + 1][n];

        return recursion(nums, target, 0, 0);
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {1, 5, 11, 5};

        //Check if the array can be partitioned
        boolean result = canPartition(nums);

        //Output result
        System.out.println("Can partition into two equal subsets: " + result);
    }
}