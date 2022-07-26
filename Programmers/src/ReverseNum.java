class Solution {
    public int[] solution(long n) {
        long number = n;
        int cnt = 0;
        
        while(number != 0){
            number /= 10;
            cnt++;
        }
        
        int[] answer = new int[cnt];
        
        number = n;
        for(int i = 0; number != 0; i++){
            answer[i] = (int)(number % 10);
            number /= 10;
        }
        
        return answer;
    }
}