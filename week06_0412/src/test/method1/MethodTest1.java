package test.method1;

public class MethodTest1 {
	static void print_head(char c, int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(c);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		print_head('▶',20);
		System.out.println("사용자 정의 메소드를 만들었습니다.");
		print_head('●',20);
		System.out.println("사용자 정의 메소드를 호출하겠습니다.");
		print_head('▣',20);
	}
}
