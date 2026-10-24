class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int a1=dateToDay(arriveAlice);
        int a2=dateToDay(leaveAlice);
        int a3=dateToDay(arriveBob);
        int a4=dateToDay(leaveBob);

        int start=Math.max(a1,a3);
        int end=Math.min(a2,a4);

        if(start>end){
            return 0;
        }
        return end- start + 1;
    }

        public int dateToDay(String date){
            int month=Integer.parseInt(date.substring(0,2));
            int day=Integer.parseInt(date.substring(3,5));

            int[] nums={31,28,31,30,31,30,31,31,30,31,30,31};
            int total=0;
            for(int i=0;i<month - 1;i++){
                total+=nums[i];
            }
            total+=day;

        
        return total;
    }
}