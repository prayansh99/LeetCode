class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
//            map.computeIfAbsent(i, j-> 1);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> res = new ArrayList<>();
        int minValue = 100000;
        List<Integer> temp = new ArrayList<>();
        temp.addAll(map.values());
        Collections.sort(temp, Collections.reverseOrder());
        int min = temp.get(k-1);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() >= min && k > 0){
                res.add(entry.getKey());
                k -= 1;
            }
        }
        int[] intArray = res.stream().mapToInt(Integer::intValue).toArray();
        return intArray;
    }
}