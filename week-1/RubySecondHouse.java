import java.util.Scanner;

public class RubySecondHouse {
    // i solve this question with the help of recursion 
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int k = scanner.nextInt();
int[][] costs = new int[n][k];
// take input for cost 
for (int i = 0; i < n; i++) {
for (int j = 0; j < k; j++) {
costs[i][j] = scanner.nextInt();
}
// npo colour is painted so -1;
int prevColor=-1;
int currHouse=0;

// call function and print the output also 
System.out.println(calculateMinCost(costs,prevColor,currHouse,n,k));
}

}
// this is the reecursion function 
    public static int  calculateMinCost(int[][] costs,int prevColor,int currHouse,int n,int k ){
        
          if (currHouse == n) return 0;
           int ans=Integer.MAX_VALUE;
            for (int color = 0; color < k; color++) {
            if (color != prevColor) {
                int currCost = costs[currHouse][color] + calculateMinCost(costs,color,currHouse+1,n,k);
                ans = Math.min(ans, currCost);
            }
        }

        return ans;


        
    }
    
}
