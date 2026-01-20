class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n - 3; i++){
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            if((long)nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target)
                continue;
            if((long)nums[i] + nums[n - 1] + nums[n - 2] + nums[n - 3] < target)
                continue;
            for(int j = i + 1; j < n - 2; j++){
                if(j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                long sum1 = nums[i] + nums[j];
                int left = j + 1;
                int right = n - 1;
                while(left < right){
                    long sum = (long)sum1 + nums[left] + nums[right];
                    if(sum == target){
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
                        result.add(list);
                        left ++;
                        right --;
                        while(left < right && nums[left] == nums[left - 1])
                            left ++;
                        while(left < right && nums[right] == nums[right + 1])
                            right --;
                    }
                    else if(sum < target){
                        left ++;
                    }
                    else{
                        right --;
                    }
                }
            }
        }
        return result;
        // int i = 0;
        // for(; i < n - 4; i++){
        //     int j = i + 1;
        //     int sum1 = nums[i] + nums[j];
        //     int left = j + 1;
        //     int right = n - 1;
        //     while(left < right){
        //         int sum2 = nums[left] + nums[right];
        //         if(sum1 + sum2 == target){
        //             List<Integer> list = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
        //             result.add(list);
        //             i ++;
        //             while(nums[i] == nums[i - 1])
        //                 i ++;
        //             continue;
        //         }
        //         else if()
        //     }
        // }
    }
}