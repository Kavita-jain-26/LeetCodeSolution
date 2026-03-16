class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //https://interviewing.io/questions/top-k-frequent-elements

        PriorityQueue<Map.Entry<Integer, Integer>> minheap = new PriorityQueue<>(k, (a,b)->a.getValue()-b.getValue());

        Map<Integer, Integer> counts = new HashMap<>();
        for(int num: nums){
            counts.put(num, counts.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry :counts.entrySet()){
         minheap.offer(entry);

         if(minheap.size()>k){
         minheap.poll();
         }        
        }

        int[] result = new int[k];
        for(int i = 0; i< k ; i++){
            result[i] = minheap.poll().getKey();
        }
     
     
    return result;

    }
}