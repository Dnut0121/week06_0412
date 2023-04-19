package test.dynamic.array;
//시험나옴
public class DynamicArrayTest {

	public static void main(String[] args) {
		int[] num = {3, 1, 5};
		int[][] arr = new int[3][];
		int cnt = 0;
		//2차원배열
		for(int i = 0; i<arr.length;i++) {
			arr[i] = new int[i+1];//하나씩늘어나는 규칙성
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ++cnt;
			}
		}
		for(int i = 0; i<arr.length;i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		//1차원 배열
		for(int i = 0; i<arr.length;i++) {
			arr[i] = new int[num[i]];//규칙이없는 일차원배열
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ++cnt;
			}
		}
		for(int i = 0; i<arr.length;i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
