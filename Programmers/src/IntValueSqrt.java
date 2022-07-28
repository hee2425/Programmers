import java.util.*;

class Solution {
  public long solution(long n) {
      Double root = Math.sqrt(n);
      
      if(root == root.intValue()){  //정수형 숫자로 바꿈
          return (long)Math.pow(root + 1, 2); 
      } else return -1;
  }
}