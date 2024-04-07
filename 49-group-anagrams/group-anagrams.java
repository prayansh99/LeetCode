class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String s : strs){
            String[] teampArray = s.split("");
            Arrays.sort(teampArray);
            String temp = String.join("", teampArray);
            if(!map.containsKey(temp)){
                map.put(temp, new ArrayList<>());
            }
            map.get(temp).add(s);
        }
        ArrayList res = new ArrayList<>();
        res.addAll(map.values());
        // for(Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
        //     res.add(entry.getValue());
        // }
        return res;
    }
}