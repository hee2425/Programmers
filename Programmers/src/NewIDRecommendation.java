
class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();   //1�ܰ� : �ҹ��ڷ� ��ȯ
        
        answer = answer.replaceAll("[^0-9a-z-_.]", "");  //2�ܰ� :  ����ǥ���� ���
        answer = answer.replaceAll("[.]{2,}", ".");  //3�ܰ� : .�� 2�� �̻� �϶� �ϳ���
        answer = answer.replaceAll("^[.]{1}", "");  //4�ܰ� : ��ħǥ�� ó���� ���϶� ����
        
        if(answer.equals(""))  answer += "a";  //5�ܰ� : ���ڿ��̶�� a����
        if(answer.length() >= 16) answer = answer.substring(0, 15);  //6�ܰ� : 16�� �̻��϶� 15�� ���� ���� 
        
        answer = answer.replaceAll("[.]{1}$", "");  //������ ��ħǥ�� �� -> ����
       
        
        if(answer.length() <= 2) {  //7�ܰ� : ���̰� 2����
            for(int i = answer.length(); i < 3; i++){// ������ ���ڸ� ���̰� 3�� �ɶ����� �ݺ�
                answer += answer.substring(answer.length()-1);
            }
        }
        return answer;
    }
}
