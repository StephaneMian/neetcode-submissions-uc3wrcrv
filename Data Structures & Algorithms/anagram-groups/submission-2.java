class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> H=new HashMap<>();
        for(String s: strs) {
            char[] c= s.toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            if (!H.containsKey(key)) {
                H.put(key,new ArrayList<>());
                H.get(key).add(s);
            }else {H.get(key).add(s);
            }
        }
        return new ArrayList<>(H.values());
    }
}
