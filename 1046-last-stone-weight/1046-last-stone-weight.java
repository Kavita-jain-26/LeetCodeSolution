class Solution {
    public int lastStoneWeight(int[] stones) {
     PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

     for(int s: stones)
        pq.offer(s);
     while(pq.size()>1){
        pq.offer(pq.poll() - pq.poll());
     }
     return pq.peek();


        
    }
}

