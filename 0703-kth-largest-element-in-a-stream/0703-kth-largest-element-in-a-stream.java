class KthLargest {

    PriorityQueue<Integer> stream;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        stream = new PriorityQueue<>(k);
        for(int n: nums){
            add(n);
        } 
    }
    
    public int add(int val) {
        if(stream.size() < k){
            stream.offer(val);
        } else{
           if(stream.peek() < val){
            stream.poll();
            stream.offer(val);
           }
        }
        return stream.peek();

    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */