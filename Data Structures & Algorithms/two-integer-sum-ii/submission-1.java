class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left=0;
        int right = n-1;
        while(left<right) {
            int g=numbers[left];
            int d=numbers[right];
            if (g+d==target) {
                return new int[]{left+1,right+1};
            } else if (g+d<target) {
                left++;
            } else {
                right--;
            }
        }
        throw new IllegalArgumentException("Aucune solution trouvée");
    }
}
