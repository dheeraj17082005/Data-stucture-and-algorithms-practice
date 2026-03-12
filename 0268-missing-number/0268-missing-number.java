class Solution {
    public void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i<n){
            int idx = arr[i];
            if(arr[i]==n || arr[i]==i) i++;
            else swap(arr,i,idx);
    }
        for(i=0;i<n;i++){
            if(arr[i]!=i) return i;
        }
        return n;
    }
}