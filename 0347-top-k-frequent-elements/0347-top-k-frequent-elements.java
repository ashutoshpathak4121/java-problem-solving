class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
          HashMap<Integer,Integer> map = new HashMap<>();

          // Count Frequencies
          for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
          }

           // Min heap based on frequency
            PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

            for (int num : map.keySet()) {
                minHeap.offer(num);

                if (minHeap.size() > k) {
                    minHeap.poll();
                }
            }

            // Extract the k most frequent elements
            int[] result = new int[k];

            for (int i=0; i<k; i++) {
                result[i] = minHeap.poll();
            }

            return result;
    }
}