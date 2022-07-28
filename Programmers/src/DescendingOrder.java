import java.util.*;
class Solution {
    public long solution(long n) {
        String num = Long.toString(n);
        
        String[] str = new String[num.length()];
        str = num.split("");
        
        Arrays.sort(str, Collections.reverseOrder());
        
        String answer = "";
        for(String i: str){
            answer += i;
        }
        return Long.parseLong(answer);
    }
}