import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        
        int[][] supo = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        
        //답 비교
        int[] result = new int[3];
        for(int i=0; i<answers.length; i++){
            for(int j=0; j<3; j++){
                if(answers[i] == supo[j][i % supo[j].length]){
                    result[j]++;
                }
            }
        }
        
        int max = 0;
        for(int i=0; i<3; i++){
            if(result[i] > max){
                max = result[i];  //최댓값 구하기
            }
        }
        
        if(max == 0){ //아무도 못맞출 경우
            return new int[] {};
        }
        
        List<Integer> winner = new ArrayList<Integer>();
        for(int i=0; i<3; i++){
            if(result[i] == max){
                winner.add(i);
            }
        }
        
        int size = winner.size();
        int[] answer = new int[size];
        for(int i=0; i<size; i++){
            answer[i] = winner.get(i) + 1;
        }
        Arrays.sort(answer);
        
        return answer;
    }
}