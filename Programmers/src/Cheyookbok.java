/*��ü �л��� n
ü���� �������� �л� ��ȣ �迭 lost
������ ü���� �ִ� �л� �迭 reserve
ü������ ���� �� �ִ� �л� �ִ�return*/

import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;  //����x �л� ��, ü���� �ִ� �л�
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i=0; i<lost.length; i++){  
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){ //�������� �л� = ���� �ִ� �л�
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        for(int i=0; i<lost.length; i++){ 
            for(int j=0; j<reserve.length; j++){
                if((lost[i] -1 == reserve[j]) || (lost[i] +1 == reserve[j])){ //(�������� �л� != ���� �ִ� �л�) && (���� �� �ִ� �л�)
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}