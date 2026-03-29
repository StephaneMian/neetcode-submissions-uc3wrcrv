class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> H= new HashSet<>();
        for(int num:nums) {
            H.add(num);
        }
        int longestsequence=0;
        for (int num:nums){
            if (!H.contains(num-1)) {
                int currentnum=num;
                int currentsequence=1;
                while(H.contains(currentnum+1)){
                    currentnum+=1;
                    currentsequence+=1;
                }
                longestsequence=Math.max(longestsequence,currentsequence);
            }
        }
        return longestsequence;
    }
}
