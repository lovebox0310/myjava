package chap02.examples;

public class Explitcit {
	public static void main(String[] args) {
		// 명시적인 변환
		// byte ← short ← int ← long ← float ← double
		// 		   char ↙
		
		int i = 103029770;
		byte b = (byte) i;
		System.out.println(i);
		System.out.println(b);
	}
}
