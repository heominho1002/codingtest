package chap01;

public class Max3m {
	static int max3(int a, int b, int c) {
		int max = a;
		
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}		
		return max;
	}
	public static void main(String[] args) {
		System.out.println("max3(1,2,3) : " + max3(1,2,3));
		System.out.println("max3(3,4,7) : " + max3(3,4,7));
		System.out.println("max3(8,6,5) : " + max3(8,6,5));
		System.out.println("max3(16,85,26) : " + max3(16,85,26));
		System.out.println("max3(32,12,1) : " + max3(32,12,1));
		System.out.println("max3(14,22,33) : " + max3(14,22,33));
		System.out.println("max3(12,32,23) : " + max3(12,32,23));
	}

}
