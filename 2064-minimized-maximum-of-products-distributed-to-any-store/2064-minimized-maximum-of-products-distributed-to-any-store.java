class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int max = 0;
        for(int ele : quantities){
            max = Math.max(max,ele);
        }
        int low = 1;int high = max; int ans = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(check(mid,n,quantities)){
                high = mid-1;
                ans = mid;
            }
            else low = mid+1;
        }
        return ans;
    }
    public boolean check(int x,int n,int[] quantities){
        int storeNeeded = 0;
        for(int i = 0;i<quantities.length;i++){
            if(storeNeeded<=n) storeNeeded+=(quantities[i]+x-1)/x;
            if(storeNeeded>n) return false;
        }
        return true;
        
    }
}