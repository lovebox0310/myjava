package chap02.datatype;

public class Short1 {
	public static void main(String[] args) {
		// 2byte 크기
		// -32768 ~ 32767
		short s;
		s = 32767;
//		s = 32768;
		
		System.out.println(s);
		
		// 오버플로우 유발
		s++;
		System.out.println(s);
	}
}
