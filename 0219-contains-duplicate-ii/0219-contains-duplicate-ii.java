class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                if( Math.abs(map.get(nums[i]) - i) <=k){
                   count = 1;

                }
                
                  

            }
            
            map.put(nums[i], i);
        }
        return count == 1?true: false;
    }
}