class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = n;

        for (int i=0; i<n; i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor;




        // // we use hashmap to solve this 

        // HashSet<Integer> set = new HashSet<>();

        // for (int num : nums) {
        //     set.add(num);
        // }

        // for (int i = 0; i <= nums.length; i++) {
        //     if (!set.contains(i)) {
        //         return i;
        //     }
        // }
        // return -1;
    }
}