/*��ü ���������� ���� N
  ������ �̿��ϴ� ����ڰ� ���� �����ִ� ���������� ��ȣ�� ��� �迭 stages
  ������ = ���������� ���������� ���� Ŭ�������� ���� �÷��̾��� �� / ���������� ������ �÷��̾� �� */
import java.util.ArrayList;
import java.util.Collections;


class Solution {

    public int[] solution(int N, int[] stages) {

        int[] answer = new int[N];

        double[] stage = new double[N+1];  // ������������ �ӹ��� �ִ� ����ڼ��� ��� �迭
        //double���� ������ ���߿� ������ ����� ����

       
        for(int i : stages){ // stage�迭�� �ӹ����ִ� ����ڼ��� ����, �ε���i = ����������ȣ
							if(i == N+1){
                continue;
            }
            stage[i]++;
        }
        
        ArrayList<Double> fail = new ArrayList<Double>(); // �������� ����� ���� list
   
        double s =stages.length; //���������� ������ �����       
        double tmp = 0;
       
        for(int i=1; i<stage.length; i++){
            tmp = stage[i];  
            
            if(s == 0){ // ������ ����� ���� 0 �̸�, �������� 0
                stage[i]=0;
            }else{
                stage[i] = stage[i]/s;  //������ ���
                s -= tmp;
            }

            fail.add(stage[i]);  //������ ����Ʈ�� ����

      }


     Collections.sort(fail,Collections.reverseOrder());  //�������� ����
    
     for(int i=0; i<fail.size(); i++){
         for(int j=1; j<stage.length; j++){
             if(fail.get(i) == stage[j]){ //fail�� = stage���̸�
                 answer[i] = j; // stage �ε����� answer�迭�� ����
                 stage[j] = -1; 
                 break;

            }
        }
    }
    return answer;
    }

}