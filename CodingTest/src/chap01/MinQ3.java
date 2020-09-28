package chap01;

public class MinQ3 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		if(min > d) {
			min = d;
		}
		return min;
	}
	public static void main(String[] args) {
		System.out.println("다음중 최소값 (1,41,23,21) :"+ min4(1, 41, 23, 21));
		System.out.println("다음중 최소값 (14,121,113,231) :"+ min4(231,121,113,14));

	}

}
