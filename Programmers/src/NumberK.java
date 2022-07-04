import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){  //입력한 commands만큼 반복
            List<Integer> arr = new ArrayList<Integer>();
            for(int j=commands[i][0]-1; j<commands[i][1]; j++){  //i에서 j까지
                arr.add(array[j]);
            }
            Collections.sort(arr);  //오름 차순
            answer[i] = arr.get(commands[i][2]-1); //commands[i][2]가 k
        }
        
        return answer;
    }
}