class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        // Max-heap sorted by distance descending
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(distSq(b), distSq(a))
        );

        for (int[] point : points) {
            maxHeap.offer(point);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }

    private int distSq(int[] p) {
        return p[0] * p[0] + p[1] * p[1];
    }
}