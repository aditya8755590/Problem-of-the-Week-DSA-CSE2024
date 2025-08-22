
public class MinimumNumberofPerfectSquarestoSumtoN {
    public static void main(String[] args) {
       MinimumNumberofPerfectSquarestoSumtoN obj=new MinimumNumberofPerfectSquarestoSumtoN();
       Solution ss =obj.new Solution();
        System.out.println(ss.numSquares(35));
    }

   class Solution {

   public static int numSquares(int n) {
        int size=(int)Math.sqrt(n);
       int[][] dp=new int[n+1][size+1];
        return squreFn(n,0,1,dp);
    }
    public static int squreFn(int n,int curr,int idx,int[][]dp){
           if(curr==n){
            return 0;
           }
           if(idx*idx>n){
            return Integer.MAX_VALUE;
           }
           if(curr>n){
            return Integer.MAX_VALUE;
           }
        if(dp[curr][idx]!=0){
            return dp[curr][idx];
        }
           int squre=idx*idx;
           int include=squreFn(n,curr+squre,idx,dp);
           if(include!=Integer.MAX_VALUE){
            include+=1;
           }
           int notInclude=squreFn(n,curr,idx+1,dp);

            if(include!=Integer.MAX_VALUE&&notInclude!=Integer.MAX_VALUE){
            return  dp[curr][idx]=Math.min(include,notInclude);
           }
            return dp[curr][idx]=Math.min(include,notInclude);
           
 }
    }
}
