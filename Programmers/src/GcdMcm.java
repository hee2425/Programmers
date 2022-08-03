class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int b = Math.max(n,m);
        int s = Math.min(n,m);
        
        int gcd = gcd(b,s);  //�ִ�����
        int mcm = b*s/gcd;  //�ּҰ����
        
        answer[0] = gcd; answer[1] = mcm;
        return answer;
    }
    static int gcd(int a, int b){
        if(a%b == 0){
            return b;
        }
        return gcd(b, a%b);
    }
}