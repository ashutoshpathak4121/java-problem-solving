class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int maxLength = 0;
        boolean hasOdd = false;
        
        for (int count : map.values()) {
            maxLength += (count / 2) * 2;
            
            if (count % 2 != 0) {
                hasOdd = true;
            }
        }
        
        if (hasOdd) {
            maxLength += 1;
        }
        
        return maxLength;
    }
}