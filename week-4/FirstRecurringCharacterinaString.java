import java.util.HashSet;

public class FirstRecurringCharacterinaString {
    public static Character firstRecurringChar(String s) {
        HashSet<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                return c;
            }
            seen.add(c);
        }
        return null;
    }

    public static void main(String[] args) {
        String input = "acbbac";
        Character result = firstRecurringChar(input);
        if (result != null) {
            System.out.println("First recurring character: " + result);
        } else {
            System.out.println("No recurring character found.");
        }
    }
}