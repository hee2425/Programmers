//(0,2)(2,4)(4,6)  i=2
//(0,3)(3,6)(6,9)  i=3
//(0,4)(4,8)(8,12) i=4
class Solution {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        
        if(s.length() == 1){  
            return 1;
        }

        //1~s.length()/2 ��ŭ ���డ��
        for(int i=1; i<= s.length()/2; i++){ 
            String str = ""; //���� ���̺� ���ڿ� 
            String tmp = ""; //�ڸ� ���ڿ� �� 
            int cnt = 1;  //�ڸ� ���ڿ� ī����
            
            for(int j=0; j<s.length()/i; j++){
                //�ڸ� ���ڿ��� ���� �ڸ� ���ڿ��� ī��Ʈ
                if(tmp.equals(s.substring(j*i, (j*i)+i))){
                    cnt++;
                    continue;
                }
                if(cnt>1){
                    str += cnt+tmp;  //cnt 2�̻�, ���� �ְ� �ڿ� ����
                    cnt=1;
                }else{
                    str+=tmp; 
                }
                tmp = s.substring(j*i, (j*i)+i);
            }
            
            //������ ���� ������ ���ڿ� ����
            if(cnt >1){  
                str += cnt+tmp;
                cnt =1;
            }else{
                str +=tmp;
            }
            
            if(s.length()%i != 0){
                str += s.substring(s.length()-s.length()%i, s.length());
            }
            answer = Math.min(answer, str.length());
        }
        return answer;
    }
}