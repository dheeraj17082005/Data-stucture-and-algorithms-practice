class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();
        for(int i = 0;i<n;i++){
            adjLs.add(new ArrayList<Integer>());
        }
        //change matrix to list
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(isConnected[i][j] == 1 && i!=j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        int vis[] = new int[n+1];
        int count = 0;
        for(int i = 0;i<n;i++){
            if(vis[i]==0){
                count++;
                dfs(i,adjLs,vis);
            }
        }
        return count;
    }
    public void dfs(int i , ArrayList<ArrayList<Integer>> adjLs,int vis[]){
        ArrayList<Integer> ls = new ArrayList<>();
        vis[i] = 1;
        ls.add(i);

        for(Integer it : adjLs.get(i)){
            if(vis[it] == 0){
                dfs(it,adjLs,vis);
            }
        }
    }
}