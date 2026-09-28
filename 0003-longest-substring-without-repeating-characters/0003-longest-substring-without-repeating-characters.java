class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        HashMap<Character, Integer> charMap = new HashMap<>();
        
        for (int left = 0, right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
           
            if (charMap.containsKey(currentChar)) {
                left = Math.max(charMap.get(currentChar) + 1, left);
            }
            
            
            maxLength = Math.max(maxLength, right - left + 1);
            
            
            charMap.put(currentChar, right);
        }
        
        return maxLength;
    }
}