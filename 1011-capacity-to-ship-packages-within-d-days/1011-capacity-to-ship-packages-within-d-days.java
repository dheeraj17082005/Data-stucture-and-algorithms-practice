class Solution {
    public int days(int capacity,int[] weights ){
        int c = capacity;
        int days = 0;
        for(int ele : weights){
            if(c>=ele) c-=ele;
            else {
                days++; 
                c = capacity-ele;
                }
        }
        days++;
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int ele : weights){
            max = Math.max(max,ele);
            sum+=ele;
        }
        int low = max; int high = sum; int ans = sum;
        while(low<=high){
            int mid = low+(high-low)/2;
            if((days(mid,weights))<=days){
                high = mid-1;
                ans = mid;
            }
            else low = mid+1;
        }
        return ans;
    }
}