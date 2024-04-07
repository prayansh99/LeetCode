class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] result = new int[2];
        while(numbers[left] + numbers[right] != target) {
            if(numbers[left] + numbers[right] < target) {
                left += 1;
            } else if (numbers[left] + numbers[right] > target) {
                right -= 1;
            }
        }
        result[0] = left + 1;
        result[1] = right + 1;
        return result;
    }
}