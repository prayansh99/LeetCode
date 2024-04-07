class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int product = 1;
        long zeroOccurance = Arrays.stream(nums).filter(k -> k == 0).count();
        if(zeroOccurance >= 2){
            return res;
        } else if (zeroOccurance == 1) {
            int zeroIndex = -1;
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] != 0){
                    product *= nums[i];
                } else 
                    zeroIndex = i;
            }
            res[zeroIndex] = product;
            return res;
        } else {
            for(int i = 0; i < nums.length; i++) {
                product *= nums[i];
            }
            for(int i = 0; i < res.length; i++) {
                res[i] = product/nums[i];
            }
            return res;
        }
    }
}