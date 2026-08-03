class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, target, new ArrayList<>(), candidates, result);
        return result;
    }

    private void backtrack(int start, int target, List<Integer> currentPath, int[] candidates, List<List<Integer>> result) {
       
        if (target == 0) {
            result.add(new ArrayList<>(currentPath));
            return;
        }
        
        
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
          
            currentPath.add(candidates[i]);
            backtrack(i, target - candidates[i], currentPath, candidates, result);
            currentPath.remove(currentPath.size() - 1);
        }
    }
}