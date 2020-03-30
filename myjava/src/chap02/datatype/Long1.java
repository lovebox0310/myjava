package chap02.datatype;

public class Long1 {
	public static void main(String[] args) {
		
		// 8byte 크기
		// -9,224,372,036,854,775,808 ~ 9,224,372,036,854,775,807
		
		long l;
		l = 2147448647;
		
		// int 값을 넘어가면 L을 붙여서 long을 구분해준다.
		l = 2147448647L;
		l = 3000000000L; // 대문자 권장
		l = 3000000000l; // 소문자 혼돈이 올수 있음.
		System.out.println(l);
	}
}
