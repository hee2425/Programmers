class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length()%2 == 0){
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        }else{
            answer = s.substring(s.length()/2, s.length()/2+1);
        }
        return answer;
    }
}

//s.string(start, end) -> start번째 수부터 end전까지 반환