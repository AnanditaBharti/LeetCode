class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        int n = spells.length;
        int m = potions.length;
        Arrays.sort(potions);
        int[] pairs = new int[n];

        for(int i = 0; i < n; i ++){
            long target = (success % spells[i] == 0) ? (success / spells[i]) : ((success / spells[i]) + 1);
            int left = 0;
            int right = m - 1;
            while(left <= right){
                int mid = left + (right - left) / 2;
                if(potions[mid] < target){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
            pairs[i] = m - left;
        }
        return pairs;
    }
}