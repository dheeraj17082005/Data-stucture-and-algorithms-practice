class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
     
        Arrays.sort(candidates);
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
     
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            
            currentPath.add(candidates[i]);
            backtrack(i + 1, target - candidates[i], currentPath, candidates, result);
           
            currentPath.remove(currentPath.size() - 1);
        }
    }
}