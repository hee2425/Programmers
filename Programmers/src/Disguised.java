import java.util.HashMap;
import java.util.Set;
class Solution {
    public int solution(String[][] clothes) {  //�ǻ��� �̸�, �ǻ��� ����
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();  //������ ���� ���� �ؽø�
        for(int i=0; i<clothes.length; i++){
            String key = clothes[i][1];  //face, eyewear..
            if(!map.containsKey(key)){
                map.put(key,1);
            }
            else{
                map.put(key, map.get(key)+1);
            }
        }
        Set<String> keySet = map.keySet();  //�ǻ� ����
        for(String key : keySet){
            answer = answer*(map.get(key)+1);
        }
        return answer-1;  //�ƹ��͵� ���Դ� ��� ��
    }
}