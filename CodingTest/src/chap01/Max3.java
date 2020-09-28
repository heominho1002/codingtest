package chap01;

import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("최대값 구하기 프로그램");

			System.out.println("a 값 : ");
			int a = scan.nextInt();
			System.out.println("입력한 a 값 : " + a);

			System.out.println("b 값 : ");
			int b = scan.nextInt();
			System.out.println("입력한 b 값 : " + b);

			System.out.println("c 값 : ");
			int c = scan.nextInt();
			System.out.println("입력한 c 값 : " + c);

			int max = a;

			if (b > max) {
				max = b;
			}
			if (c > max) {
				max = c;
			}
			System.out.println("입력된 값중 최대값은 " + max + "입니다");
		}
	}

}
