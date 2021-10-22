package test;

public class Test {
	public static void main(String[] args) {
		int arr[] = {9, 5, 8, 4, 7, 2, 3, 6, 1, 5, 11, 7, 4};
		for(int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			int tmpIdx = i;
			int tmp;
			for(int j = 1; i + j < arr.length; j++) {
				if(min > arr[i + j]) {
					min = arr[i + j];
					tmpIdx = i + j;
				}
			}
			tmp = arr[i];
			arr[i] = arr[tmpIdx];
			arr[tmpIdx] = tmp;
		}
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
