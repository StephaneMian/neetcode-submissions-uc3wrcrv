class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        HashSet h=new HashSet();
        for(int i=0;i<n;i++) {
            h.add(nums[i]);
        }
        return n!=h.size();

    }
}