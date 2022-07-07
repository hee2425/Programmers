
class Solution {
    public String solution(int a, int b) {
        int months[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String days[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        
        int today = 0;
        for(int i=1; i<a; i++){
            today += months[i-1];
        }
        
        today  = today + b-1;  //1월 1일부터 시작해서 1빼줌
        
        
        String answer = days[(today+5)%7];  //금요일이니 +5
        return answer;
    }
}