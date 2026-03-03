class Solution {
    public long hours(int[] piles,int hours){
        long h = 0;
        for(int ele : piles){
            if(ele%hours==0) h+= ele/hours;
            else h+=(ele/hours)+1;
        }
        return h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int ele : piles){
            max = Math.max(max,ele);
        }
        int low = 1; int high = max; int speed = max;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(hours(piles,mid)<=h){
                high = mid - 1;
                speed = mid;
            }
            else low = mid + 1;
        }
        return speed;
    }
}