package chap02.datatype;

public class Integer1 {
	public static void main(String[] args) {
		// 4byte 크기
		// -2147483648 ~ 2147483647
		
		int i;
		i = 2147483647;
//		i = 2147483648;
		
		System.out.println(i);
		
		// 오버플로우 발생
		i++;
		System.out.println(i);
		
		// 자리수를 맞춰서 표기 할수 있다.
		i = 2_147_483_647;
		i = 21_478_367;
		
		// 8진법
		i = 0765;
		System.out.println(i);
		
		// 16진법
		i = 0xACCF;
		System.out.println(i);
	}
}
