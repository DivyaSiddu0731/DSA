package sorts;

public class InsertionSort {
	protected void sort(int[] a) {
		int i = 0;
		while (i >= 0 && i < a.length) {
			int j = a.length - 1;
			while (j < a.length && j > i) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					j--;
				} else if (a[j] >= a[i]) {
					j--;
				}
			}
			i++;
		}
	}

	void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
