import java.util.*;
public class StepWordsFinder{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        // Enter no of words 
        int n=sc.nextInt();

        // take all words in dictonary 
        String[] dict=new String[n];
        for(int i=0;i<n;i++){
            dict[i]=sc.nextLine();
        }
        // call and print the output 
        System.out.println(wordFinder(word,dict));
    }
 
    public static String wordFinder(String word,String[] dict) {
        ArrayList<String> list=new ArrayList<>();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
           map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(String str: dict){
            // if the word is not size+1 size
            if(str.length() != word.length() + 1){
                continue;
            }
            // create a copy of the map to avoid modifying the original
            HashMap<Character, Integer> mapCopy = new HashMap<>(map);
            // call a function for checking 
            if(check(mapCopy, str,word)){
                list.add(str);
            }
        }
        return list.toString();
    }

    public static boolean check(HashMap<Character,Integer> map, String str,String word) {
        int extraCharCount = 0;

    for (char ch : str.toCharArray()) {
        if (map.containsKey(ch)) {
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        } else {
            extraCharCount++;
        }
    }

    // it is only valid when exectly one char is extra
    return extraCharCount == 1 && map.isEmpty();
    }

}
