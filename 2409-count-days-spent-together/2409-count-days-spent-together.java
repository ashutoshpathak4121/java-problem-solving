class Solution {
    private static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        
        int aStart = getDayOfYear(arriveAlice);
        int aEnd = getDayOfYear(leaveAlice);
        int bStart = getDayOfYear(arriveBob);
        int bEnd = getDayOfYear(leaveBob);

        int overlapStart = Math.max(aStart, bStart);
        int overlapEnd = Math.min(aEnd, bEnd);

        return Math.max(0, overlapEnd - overlapStart + 1);
    }

    private int getDayOfYear(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        int totalDays = day;
        for (int i = 0; i < month - 1; i++) {
            totalDays += DAYS_IN_MONTHS[i];
        }

        return totalDays;
    }
}