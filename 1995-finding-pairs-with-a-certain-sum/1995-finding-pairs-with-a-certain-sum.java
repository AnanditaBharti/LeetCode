class FindSumPairs {
    int[] nums1;
    int[] nums2;
    HashMap<Integer, Integer> ele;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        ele = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            ele.put(nums2[i], ele.getOrDefault(nums2[i], 0) + 1);
        }
    }
    
    public void add(int index, int val) {
        int oldVal = nums2[index];
        nums2[index] += val;
        ele.put(nums2[index], ele.getOrDefault(nums2[index], 0) + 1);
        if(ele.get(oldVal) > 1){
            ele.put(oldVal, ele.get(oldVal) - 1);
        }
        else{
            ele.remove(oldVal);
        }
    }
    
    public int count(int tot) {
        int c = 0;
        for(int i = 0; i < nums1.length; i++){
            int temp = tot - nums1[i];
            if(ele.containsKey(temp)){
                c += ele.get(temp);
            }
        }
        return c;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */