class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> H= new HashMap<>();
        for(int n: nums) {
            if(!H.containsKey(n)){
                H.put(n,1);
            } else {
                H.put(n,H.get(n)+1);
            }
        }
        PriorityQueue<Integer> PQ= new PriorityQueue<>( (a,b) -> H.get(a)-H.get(b));
        
        for(int n:H.keySet()){
            PQ.add(n);
            if(PQ.size()>k) {
                PQ.poll();
            }
        }
        int[] top=new int[k];
        for(int i=0;i<k;i++){
            top[i]=PQ.poll();
        }
        return top;
    }
}
