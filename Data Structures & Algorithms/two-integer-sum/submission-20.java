class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> H=new HashMap<>();
        for (int i=0;i<n;i++) {
            int diff= target-nums[i];
            if (H.containsKey(diff)) {
                return new int[]{H.get(diff),i};
            }
            H.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution found");
    }
}
