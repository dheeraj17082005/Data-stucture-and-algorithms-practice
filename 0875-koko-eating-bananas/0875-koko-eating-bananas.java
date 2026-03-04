class Solution {
    public int minEatingSpeed(int[] piles, int speed) {
        int max = 0;
        for(int ele : piles){
            max = Math.max(max,ele);
        }
        int low = 1;int high = max;int hours = max;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(hours(piles,mid)<=speed){
                high = mid - 1;
                hours = mid;
            }
            else low = mid+1;
        }
        return hours;
    }
    public long hours(int[] piles,int hour){
        long h = 0;
        for(int ele : piles){
            if(ele%hour==0) h+=ele/hour;
            else h+=(ele/hour)+1;
        }
        return h;
    }
}