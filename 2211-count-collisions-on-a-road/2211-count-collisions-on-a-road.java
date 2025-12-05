class Solution {
    public int countCollisions(String directions) {
        // char[] s = directions.toCharArray();
        // int n = s.length;
        // int count = 0;

        // boolean changed = true; // flag to keep checking until all collisions are resolved

        // while (changed) {
        //     changed = false;

        //     for (int i = 1; i < n; i++) {
        //         // R hits L → both stop
        //         if (s[i - 1] == 'R' && s[i] == 'L') {
        //             count += 2;
        //             s[i - 1] = 'S';
        //             s[i] = 'S';
        //             changed = true;
        //         }
        //         // R hits stationary S
        //         else if (s[i - 1] == 'R' && s[i] == 'S') {
        //             count += 1;
        //             s[i - 1] = 'S';
        //             changed = true;
        //         }
        //         // stationary S hits L
        //         else if (s[i - 1] == 'S' && s[i] == 'L') {
        //             count += 1;
        //             s[i] = 'S';
        //             changed = true;
        //         }
        //     }
        // }

        // return count;

        char[] s = directions.toCharArray();
        int left = 0;
        int right = s.length-1;
        int count = 0; 
        while(left < s.length && s[left] == 'L'){
            left++;
        }
         while(right >= 0 && s[right] == 'R'){
            right--;
        }

        while(left<= right){
            if(s[left] == 'R' || s[left] == 'L')
            count++;
            left++;
        }
       return count;

    }

   
}
