package chap02.variables;

public class VariableScopExample {
	public static void main(String[] args) {
		int v1 = 15;
		if (v1 > 10) {
			int v2 = v1 - 10;
			
		}
		// v2가 if{}에서 선언되어서 에러.
//		int v3 = v1 + v2 + 5;
	}
}
