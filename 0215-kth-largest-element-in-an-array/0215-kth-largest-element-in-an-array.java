/* class Solution { //using maxHeap
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int n : nums){
            pq.offer(n);
        }
        int i = 1; 
        while(i < k){
            pq.poll();
            i++;
        }
        return pq.peek();

    }
} */

class Solution { //using minHeap
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

       for(int n : nums){
            pq.offer(n);

           if(pq.size() >k ){
            pq.poll();
           }

       }
       return pq.peek();     
    }
}

