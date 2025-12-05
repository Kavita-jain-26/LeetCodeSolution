class Solution {
    public int countPartitions(int[] nums) {
        
        int sum = 0;
        for(int i = 0; i <nums.length ; i++){
            sum += nums[i];
        }

        int total_right = sum, total_left =0, count =0;        
        for(int i = 0; i <nums.length-1 ; i++){
            total_right = total_right - nums[i];
            total_left += nums[i];
            System.out.println(total_right+" "+total_left);
            if(((total_right-total_left) % 2) == 0){
                count++;
            }
        }
        return count;    
    }
}