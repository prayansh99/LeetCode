class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int count = 1;
        int result = -1;
        for(int i : nums) {
            if(!set.contains(i-1)){
                count = 1;
                int temp = i;
                while(set.contains(temp + 1)){
                    count += 1;
                    temp += 1;
                }
                result = Math.max(result, count);
            }
        }
        return result;
    }
}