package chap02.variables;

public class Variables4Scope {
	public static void main(String[] args) {
		int var1 = 10;
		
		if (true) {
			int var2 = 20;
			
			var1 = 30;
			System.out.println(var1);
			
			var2 = 40;
			System.out.println(var2);
		}
		
		// 중괄호 안에서 쓸수 있는 변수가 중괄호 밖에서 사용시 에러
//		var2 = 50;
//		System.out.println(var2);
	}
}
