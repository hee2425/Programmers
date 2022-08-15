//(0,2)(2,4)(4,6)  i=2
//(0,3)(3,6)(6,9)  i=3
//(0,4)(4,8)(8,12) i=4
class Solution {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        
        if(s.length() == 1){  
            return 1;
        }

        //1~s.length()/2 만큼 압축가능
        for(int i=1; i<= s.length()/2; i++){ 
            String str = ""; //압축 길이별 문자열 
            String tmp = ""; //자른 문자열 비교 
            int cnt = 1;  //자른 문자열 카운팅
            
            for(int j=0; j<s.length()/i; j++){
                //자른 문자열과 현재 자른 문자열비교 카운트
                if(tmp.equals(s.substring(j*i, (j*i)+i))){
                    cnt++;
                    continue;
                }
                if(cnt>1){
                    str += cnt+tmp;  //cnt 2이상, 숫자 넣고 뒤에 붙임
                    cnt=1;
                }else{
                    str+=tmp; 
                }
                tmp = s.substring(j*i, (j*i)+i);
            }
            
            //붙이지 못한 나머지 문자열 붙임
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