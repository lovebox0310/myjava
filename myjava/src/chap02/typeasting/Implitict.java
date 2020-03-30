package chap02.typeasting;

public class Implitict {
	public static void main(String[] args) {
		// 자동 (묵시적)형 변환
		// 작은 크기 타입 → 큰 크기 타입
		// byte → short → int → long → float → double
		// 		   char ↗
		// boolean
		
		byte b = 10;
//		 b = s; X
		short s = b;
		int i = s;
		long l = i;
		
		float f = l;
		double d = f;
		
		char c = 'a';
		i = c;
	}

}
