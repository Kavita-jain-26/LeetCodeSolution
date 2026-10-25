// class Solution {
//     public int climbStairs(int n) {
//         if(n == 0 || n == 1) return 1;

//         return climbStairs(n-1) +climbStairs(n-2);
//     }
// }


class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairs( n , memo);
    }

    public int climbStairs(int n , Map<Integer, Integer> memo){
        if(n ==0 || n ==1)
        return 1;

        if(!memo.containsKey(n)){
            memo.put(n, climbStairs(n-1,memo)+
            climbStairs(n-2, memo));
        }
        return memo.get(n);
    }
}

// class Solution {
//     public int climbStairs(int n) {
        
//     }
// }


