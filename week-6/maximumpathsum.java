import java.util.*;
public class maximumpathsum {
    public static void main(String[] args) {

        // this test case by chat gpt
        // Construct the tree [1,-2,-3,1,3,-2,null,-1]
        // Added root node initialization
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(-2);
        root.left.left.left = new TreeNode(-1);

        Solution sol = new Solution();
        int result = sol.maxPathSum(root);
        System.out.println("Maximum Path Sum = " + result);

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        // TreeNode() {
        // }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Solution {
        int ans = Integer.MIN_VALUE;

        public int maxPathSum(TreeNode root) {
            if (root == null) {
                return 0;
            }
            maxPath(root);
            return ans;
        }

        public int maxPath(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int a = root.val;
            int b = maxPath(root.left);
            int c = maxPath(root.right);
            // 1
            int niche_hi_milgaya = a + b + c;
            // 2
            int koi_ek_accha_hai = Math.max(a + b, a + c);
            int koi_accha_nahi_hai = a;
            // 3
            ans = Math.max(Math.max(niche_hi_milgaya, koi_ek_accha_hai), Math.max(ans, a));

            // core of the part if niche hi mail gaya ans to fir vo mud bhi sakta hai to age
            // include nahi karange keval 2,3 ko hi karange
            return Math.max(koi_ek_accha_hai, koi_accha_nahi_hai);
        }
    }
}
