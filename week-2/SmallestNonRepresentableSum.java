import java.util.*;


// this is the naive apporach using O(sum*n) time complixity
public class SmallestNonRepresentableSum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("Enter the sorted array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(findsmallest(array));
        
        }

    public static long findsmallest(int[] arr) {
       int sum=0;
       for(int i=0;i<arr.length;i++){
           sum+=arr[i];
       }
       // we can iterative for each i -->>>>>>>>>>> 😀
       for(int i=1;i<sum;i++){
         if(!solution(arr,i,0)){
         return i;}
       }
       return sum+1;
       
    }

    // this is the recursive function for this 
    // for cheacking if it is possibe to find we get i or not 
    public static boolean solution(int[] arr,int k,int i){
        if (k==0)return true;
        if (i==arr.length || k < 0) return false;
        boolean include = solution(arr, k - arr[i], i+ 1);
        boolean exclude = solution(arr, k, i+ 1);
        return include || exclude;
    }
    }
