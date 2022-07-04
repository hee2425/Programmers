import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){  //�Է��� commands��ŭ �ݺ�
            List<Integer> arr = new ArrayList<Integer>();
            for(int j=commands[i][0]-1; j<commands[i][1]; j++){  //i���� j����
                arr.add(array[j]);
            }
            Collections.sort(arr);  //���� ����
            answer[i] = arr.get(commands[i][2]-1); //commands[i][2]�� k
        }
        
        return answer;
    }
}