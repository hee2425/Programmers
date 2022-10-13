import java.util.Scanner;

public class nanutsem {

	public int solution(int num1, int num2) {
		double answer = 0.0;
		answer = num1/(double)num2;
		answer = answer*1000;
		return (int)answer;
		
	}
	public static void main(String[] args) {
		nanutsem T = new nanutsem();
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(T.solution(num1, num2));
	}

}
