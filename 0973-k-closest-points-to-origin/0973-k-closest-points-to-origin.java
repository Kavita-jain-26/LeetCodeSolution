class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (p1,p2)->Integer.compare(getDistance(p2),getDistance(p1))); //max heap, its because a>b gets priority
        for(int[] point : points){
            pq.offer(point);
            if(pq.size()> k){
                pq.poll();
            }
        }
       int[][] result = new int[k][];
        for(int i = 0; i< k; i++){
            result[i] = pq.poll();

        }
        return result;

       


    }
     private int getDistance(int[] point){
          return point[0]*point[0] + point[1]*point[1];
        }
}



