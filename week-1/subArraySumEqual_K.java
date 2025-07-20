import java.util.HashMap;

public class subArraySumEqual_K {
public static void main(String[] args) {
    int k=17;
    int[] arr={1,2,34,45,22,1,1,15,13,17,10,7,7,3};

}
public static int NumberOfSubArray(int[] nums,int k){
     int count=0,currSum=0;
     HashMap<Integer,Integer> map=new HashMap<>();
       for(int i:nums){
        currSum+=i;
        if(currSum==k){
            count++;
        }
        if(map.containsKey(currSum-k)){
            count+=map.get(currSum-k);
        }
            map.put(currSum,map.getOrDefault(currSum,0)+1);
       }
       return count;
}
    
}
