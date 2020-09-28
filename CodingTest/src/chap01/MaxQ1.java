package chap01;

public class MaxQ1 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b>max) {
			max = b;
		}
		if(c>max) {
			max = c;
		}
		if(d>max) {
			max = d;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("다음중 최대값 (1,41,23,21) :"+ max4(1, 41, 23, 21));
		System.out.println("다음중 최대값 (14,121,113,231) :"+ max4(14,121,113,231));
	}
}
