class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    private boolean hasEvenDigits(int n) {
        int digits = 0;
        while (n > 0) {
            digits++;
            n /= 10;
        }
        return (digits % 2 == 0);
    }
}