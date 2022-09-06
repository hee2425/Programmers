import java.util.HashMap;
import java.util.Set;
class Solution {
    public int solution(String[][] clothes) {  //의상의 이름, 의상의 종류
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();  //종류와 갯수 담은 해시맵
        for(int i=0; i<clothes.length; i++){
            String key = clothes[i][1];  //face, eyewear..
            if(!map.containsKey(key)){
                map.put(key,1);
            }
            else{
                map.put(key, map.get(key)+1);
            }
        }
        Set<String> keySet = map.keySet();  //의상 종류
        for(String key : keySet){
            answer = answer*(map.get(key)+1);
        }
        return answer-1;  //아무것도 안입는 경우 뺌
    }
}