package test;

public class A1 {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1 };
		int count = 0;
		float per = 0.0f;
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] == 1) {
				++count;
			}
			per = (float) count * 100 / arr.length;
		}
		System.out.println("The attendance percentage of this student is: " + per + "%");
	}
}
