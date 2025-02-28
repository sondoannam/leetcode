import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacter {
    public int solution(String str) {
        int n = str.length();
        int res = 0; // result
        int i = 0;

        // Creating a hash map to store the last positions of occurrence
        HashMap<Character, Integer> lastIndex = new HashMap<>();

        // Starting from the beginning of the string
        for (int j = 0; j < n; j++) {
            // If this character is seen before, then update i
            if (lastIndex.containsKey(str.charAt(j))) {
                i = Math.max(i, lastIndex.get(str.charAt(j)) + 1);
            }

            // Update result if needed
            res = Math.max(res, j - i + 1);

            // Update the last occurrence of the current character
            lastIndex.put(str.charAt(j), j);
        }
        return res;
    }
}
