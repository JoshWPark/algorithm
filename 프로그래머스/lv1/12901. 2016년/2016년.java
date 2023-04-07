class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] month_list = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] weekday = {"FRI","SAT","SUN", "MON", "TUE", "WED", "THU"};
        int day = 0;
        for (int i =0; i<a-1; i++){
            day += month_list[i];
        }
        day += b-1;
        answer = weekday[day%7];
        return answer;
    }
}