import java.util.*;
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
        System.out.println(solution(array,n));
        
        }


        public static int solution(int[] arr,int n){
            
        }
    }
