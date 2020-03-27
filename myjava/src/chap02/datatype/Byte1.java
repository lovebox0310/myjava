package chap02.datatype;

public class Byte1 {
	public static void main(String[] args) {
		// 1byte 크기 (8bit = 0000 0000)
		// 최대 -128 ~ 127그리고 0하나
		byte b;
		
		b = 127;
		System.out.println(b);
		
		// 128은 1일 넘침 에러.
//		b = 128;
//		System.out.println(b);
		
		// 오버플로우 유도 127(1111 1111) + 1 = -128  (1000 0000)
		b++;
		System.out.println(b);
	}
}
