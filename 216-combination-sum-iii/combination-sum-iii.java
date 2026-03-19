class Solution {
    void backTrack(int k, int n, List<Integer> curr, List<List<Integer>> list){
        if(k == 0 && n == 0){
            list.add(new LinkedList<>(curr));
            return;
        }
        else if (k != 0 && n != 0){
            for(int i = (curr.isEmpty()) ? 1 : curr.get(curr.size() - 1) + 1; i < 10; i ++){
                curr.add(i);
                backTrack(k - 1, n - i, curr, list);
                curr.remove(curr.size() - 1);
            }
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new LinkedList<>();
        backTrack(k, n, new LinkedList<>(), result);
        return result;
    }
}