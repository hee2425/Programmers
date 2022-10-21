
public class Å¸°Ù³Ñ¹ö {
	int answer;
	public int Solution(int[] numbers, int target) {
		dfs(numbers, 0, target, 0);
		return answer;
	}
	public void dfs(int[] numbers, int depth, int target, int sum) {
		if(depth == numbers.length) {
			if(target == sum) answer++;
		}
		else {
			dfs(numbers, depth+1, target, sum+numbers[depth]);
			dfs(numbers, depth+1, target, sum-numbers[depth]);
		}
	}

}
