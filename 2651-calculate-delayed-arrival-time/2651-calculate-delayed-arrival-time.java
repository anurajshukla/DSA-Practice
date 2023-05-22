class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int r = arrivalTime + delayedTime;
        if(r == 24) { return 0;}
        while(r > 24) { r = r - 24;}
        return r;
    }
}