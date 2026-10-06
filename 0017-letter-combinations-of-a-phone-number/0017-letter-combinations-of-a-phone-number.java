class Solution {

    String[] letters = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return result;
        }

        backtrack(digits, 0, "");

        return result;
    }

    public void backtrack(String digits, int index, String current) {

        
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        
        String lettersForDigit =
            letters[digits.charAt(index) - '0'];

        
        for (char ch : lettersForDigit.toCharArray()) {

            backtrack(
                digits,
                index + 1,
                current + ch
            );
        }
    }
}