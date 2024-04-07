class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {-1, -1};
        int i = 0;
        int j = 1;
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)));
        Arrays.sort(nums);
        while(result[0] < 0 && result[1] < 0) {
            if ((i >= j) || (j >= nums.length)) {
                i += 1;
                j = i + 1;
            } else if (i >= (nums.length - 1)) {
                break;
            }
            if(nums[i] + nums[j] == target && i < j && (i < (nums.length - 1)) && (j < nums.length)) {
                result[0] = i;
                result[1] = j;
            } else if ((nums[i] + nums[j] < target) && (i < j) && (i < (nums.length - 1)) && (j < nums.length)) {
                j += 1;
            } else if ((nums[i] + nums[j] > target) && (i < j) && (i < (nums.length - 1)) && (j < nums.length)) {
                i += 1;
                j = i + 1;
            }
        }
        result[0] = arrayList.indexOf(nums[i]);
        result[1] = arrayList.lastIndexOf(nums[j]);
        return result;        
    }
}