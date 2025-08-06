import java.util.*;
public class SearchinASortedListWithoutMultiplicationDivisionOrBitShifts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // enter the size of arr
        System.out.println("enter the size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        // enter the elements in array
        System.out.println("enter the elements in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // enter the target 
        System.out.println("Enter the target element ");
        int target=sc.nextInt();
        System.out.println("the result is "+search(arr,target,0,n-1,n));
    }

    public static boolean search(int[] arr,int target,int i,int j,int n){
         if(i>=n||j<0){
            return false;
        }
        int mid=i+divide((j-i),2);
        if(target==arr[mid]){
            return true;
        }
        if(arr[mid]>target){
            search(arr,target,i,mid-1,n);
        }
        else{
             search(arr,target,mid+1,j,n);
        }
       return true;
    }

    // make a division function without using / *,<<
    public static int divide(int dividend, int divisor) {
        boolean negative = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int quotient = 0;

        while (a >= b) {
            a -= b;
            quotient++;
        }

        return negative ? -quotient : quotient;
    }
}
