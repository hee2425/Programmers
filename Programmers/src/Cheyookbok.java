/*전체 학생수 n
체육복 도난당한 학생 번호 배열 lost
여벌의 체육복 있는 학생 배열 reserve
체육수업 들을 수 있는 학생 최댓값return*/

import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;  //도난x 학생 수, 체육복 있는 학생
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i=0; i<lost.length; i++){  
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){ //도난당한 학생 = 여분 있는 학생
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        for(int i=0; i<lost.length; i++){ 
            for(int j=0; j<reserve.length; j++){
                if((lost[i] -1 == reserve[j]) || (lost[i] +1 == reserve[j])){ //(도난당한 학생 != 여분 있는 학생) && (빌릴 수 있는 학생)
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}