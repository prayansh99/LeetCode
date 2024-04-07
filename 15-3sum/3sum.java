class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
//        {-4, -1, -1, 0, 1, 2}
        for(int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            if(nums[i] > 0 || nums[k] < 0)
                return(result);
            int target = 0 - nums[i];
            while(j < k) {
                if(nums[j] + nums[k] < target) {
                    j += 1;
                } else if (nums[j] + nums[k] > target) {
                    k -= 1;
                } else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) {
                        j += 1;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        k -= 1;
                    }
                    j += 1;
                    k -= 1;
                }
            }
        }

        return(result);
    }
}