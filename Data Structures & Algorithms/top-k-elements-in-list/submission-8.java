class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> H= new HashMap<>();
        for(Integer i:nums) {
            if (H.containsKey(i)) {
                H.put(i,H.get(i)+1);
            }else{H.put(i,1);
            }
        }
        PriorityQueue<Integer> Q=new PriorityQueue<>( (a, b) -> H.get(a) - H.get(b) );
        for (Integer n: H.keySet()) {
            Q.add(n);
            if (Q.size()>k) {
                Q.poll();
            }
        }
        int[] top =new int[k];
        for (int i=0;i<k;i++){
            top[i]=Q.poll();
        }
        return top;
    }
}
