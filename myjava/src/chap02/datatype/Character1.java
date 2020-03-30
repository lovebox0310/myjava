package chap02.datatype;

public class Character1 {
	public static void main(String[] args) {
		// 2byte 크기
		// 0 ~ 65535
		char c;
		c = 'A'; // code 65
		System.out.println(c);
		
		c = '\u0041';
		System.out.println(c);
		
		// 대소문자 구분하지 않음
		c = '\uAC00';
		System.out.println(c);
		
		c = '\uac01';
		System.out.println(c);
		
		// 코드를 알고싶다면 int로 저장
		int i = c;
		System.out.println(i);
	}
}
