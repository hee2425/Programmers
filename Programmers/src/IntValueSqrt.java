import java.util.*;

class Solution {
  public long solution(long n) {
      Double root = Math.sqrt(n);
      
      if(root == root.intValue()){  //������ ���ڷ� �ٲ�
          return (long)Math.pow(root + 1, 2); 
      } else return -1;
  }
}