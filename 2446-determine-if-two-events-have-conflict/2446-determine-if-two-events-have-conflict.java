class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        
       int start1 = toMinute(event1[0]);
       int end1 = toMinute(event1[1]);
       int start2 = toMinute(event2[0]);
       int end2 = toMinute(event2[1]);

       return end1 >= start2 && start1 <= end2;

    }

    private int toMinute(String time){
        int hours = Integer.parseInt(time.substring(0,2));
        
        int minutes = Integer.parseInt(time.substring(3,5));

        return hours*60+minutes;
    }
}
