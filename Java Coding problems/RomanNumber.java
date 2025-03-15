import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        // Create a mapping of Roman numerals to their integer values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        // Initialize the result to 0
        int result = 0;

        // Iterate through the string s
        for (int i = 0; i < s.length(); i++) {
            // Get the value of the current character
            int currentVal = romanMap.get(s.charAt(i));

            // Check if there is a next character and its value is greater than the current character's value
            if (i < s.length() - 1 && currentVal < romanMap.get(s.charAt(i + 1))) {
                // Subtract the current value
                result -= currentVal;
            } else {
                // Otherwise, add the current value
                result += currentVal;
            }
        }

        // Return the final result
        return result;
    }
}
