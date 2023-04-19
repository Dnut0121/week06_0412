package test.method1;

public class MethodTest3 {
	static int add(int n1,int n2) {
		int sum = n1+n2;
		return sum;
	}
	public static void main(String[] args) {
		int n1 =1000;
		int n2 =2000;
		System.out.printf("%d + %d = %d\n",n1,n2,add(n1,n2));
		n1 = 1234;
		n2 = 5678;
		System.out.printf("%d + %d = %d\n",n1,n2,add(n1,n2));
	}

}
