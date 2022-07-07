/*전체 스테이지의 개수 N
  게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages
  실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수 */
import java.util.ArrayList;
import java.util.Collections;


class Solution {

    public int[] solution(int N, int[] stages) {

        int[] answer = new int[N];

        double[] stage = new double[N+1];  // 스테이지마다 머물러 있는 사용자수를 담는 배열
        //double형인 이유는 나중에 실패율 계산을 위함

       
        for(int i : stages){ // stage배열에 머물러있는 사용자수를 넣음, 인덱스i = 스테이지번호
							if(i == N+1){
                continue;
            }
            stage[i]++;
        }
        
        ArrayList<Double> fail = new ArrayList<Double>(); // 실패율을 계산해 담을 list
   
        double s =stages.length; //스테이지에 도달한 사람수       
        double tmp = 0;
       
        for(int i=1; i<stage.length; i++){
            tmp = stage[i];  
            
            if(s == 0){ // 도달한 사용자 수가 0 이면, 실패율도 0
                stage[i]=0;
            }else{
                stage[i] = stage[i]/s;  //실패율 계산
                s -= tmp;
            }

            fail.add(stage[i]);  //실패율 리스트에 담음

      }


     Collections.sort(fail,Collections.reverseOrder());  //내림차순 정렬
    
     for(int i=0; i<fail.size(); i++){
         for(int j=1; j<stage.length; j++){
             if(fail.get(i) == stage[j]){ //fail값 = stage값이면
                 answer[i] = j; // stage 인덱스를 answer배열에 담음
                 stage[j] = -1; 
                 break;

            }
        }
    }
    return answer;
    }

}