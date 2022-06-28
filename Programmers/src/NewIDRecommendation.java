
class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();   //1단계 : 소문자로 변환
        
        answer = answer.replaceAll("[^0-9a-z-_.]", "");  //2단계 :  정규표현식 사용
        answer = answer.replaceAll("[.]{2,}", ".");  //3단계 : .가 2번 이상 일때 하나로
        answer = answer.replaceAll("^[.]{1}", "");  //4단계 : 마침표가 처음과 끝일때 제거
        
        if(answer.equals(""))  answer += "a";  //5단계 : 빈문자열이라면 a대입
        if(answer.length() >= 16) answer = answer.substring(0, 15);  //6단계 : 16자 이상일때 15자 이후 제거 
        
        answer = answer.replaceAll("[.]{1}$", "");  //제거후 마침표가 끝 -> 제거
       
        
        if(answer.length() <= 2) {  //7단계 : 길이가 2이하
            for(int i = answer.length(); i < 3; i++){// 마지막 문자를 길이가 3이 될때까지 반복
                answer += answer.substring(answer.length()-1);
            }
        }
        return answer;
    }
}
