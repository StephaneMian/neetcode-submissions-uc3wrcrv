class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m= t.length();
        if (n!=m) return false;
        HashMap<Character,Integer> N= new HashMap<>();
        for (char c: s.toCharArray()) {
            if (N.get(c)==null) {
                N.put(c, 1);
            }
            N.put(c, N.get(c)+1);
        }
        for (char c: t.toCharArray()) {
            if (!N.containsKey(c))  return false;
            N.put( c, N.get(c)-1);
            if (N.get(c)<1) {
                return false;
            }
        }
        return true;
    }
}
