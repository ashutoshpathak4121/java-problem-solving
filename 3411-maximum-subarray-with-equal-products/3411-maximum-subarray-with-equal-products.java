class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxlen = 1;

        for (int i=0; i<n; i++) {
            long prod = 1;
            int g = 0;
            long l = 1;

            for (int j=i; j<n; j++) {
                int val = nums[j];
                prod *= val;
                g = (j == i) ? val : gcd(g, val);
                l = lcm(l, val);

                if (prod == l * g) {
                    maxlen = Math.max(maxlen, j-i+1);
                }


                if (prod > 2520L * l * g) {
                    break;
                }
            }
        }

        return maxlen;
    }


    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a%b;
            a=b;
            b=temp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return (a / gcd((int)a, (int)b)) * b;
    }
}