class Solution {
    public int addDigits(int num) {
        // It for to repeat until digit become single digit 
        while (num >= 10) {
            int sum = 0;

           // it extract the digit and add to sum
            while (num > 0) {
                sum = sum + num % 10;
                num = num / 10;
            }

            // it for to use sum for next round 
            num = sum;
        }
        return num;
    }
}