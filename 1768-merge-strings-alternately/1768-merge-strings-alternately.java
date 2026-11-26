class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder(word1.length() + word2.length());
        int i = 0;
        int j = 0;

        int n1 = word1.length();
        int n2 = word2.length();

        while (i < n1 && j < n2) {
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }

        if (i < n1) {
            merged.append(word1, i, n1);
        }

        if (j < n2) {
            merged.append(word2, j, n2);
        }

        return merged.toString();
    }
}