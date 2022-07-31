class Solution {
    public int[] solution(int[] arr) {

        //�迭 ���̰� 1�� ���
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        
        //���� ���� ���� �� ���̷� �ʱ�ȭ
        int[] answer = new int[arr.length-1];
        
        int min = arr[0]; 
        for(int i=1; i<arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        
        int index = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == min){
                continue;
            }
            answer[index++] = arr[i];
        }
        
        return answer;
    }
}