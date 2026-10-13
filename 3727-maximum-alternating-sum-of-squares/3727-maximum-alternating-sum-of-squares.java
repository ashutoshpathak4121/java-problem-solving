class Solution {
    public long maxAlternatingSum(int[] nums) {
        
        int n = nums.length;

        long[] squares = new long[n];
        
        for (int i = 0; i < n; i++) {
            long val = nums[i];
            squares[i] = val * val;
        }
        
        Arrays.sort(squares);
        
        long score = 0;
        int negativeCount = n / 2;
            
        for (int i = 0; i < negativeCount; i++) {
            score -= squares[i];
        }
        
        for (int i = negativeCount; i < n; i++) {
            score += squares[i];
        }
        
        return score;
    }
}