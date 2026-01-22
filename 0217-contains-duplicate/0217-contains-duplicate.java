class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> x= new HashSet<>();

        for(int num : nums){

          if(x.contains(num)){
            return true;
          }else{
            x.add(num);
          }

        }
        return false;
    }
}