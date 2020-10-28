package search;

public class BinarySearch {
	protected void search(int[] a, int low, int high, int n) {
		if (low < high) {
			int mid = (int) ((low + high) / 2);
			if (a[mid] == n) {
				System.out.println("found");
				;
			} else if (n > a[mid]) {
				search(a, mid + 1, high, n);
			} else if (n < a[mid]) {
				search(a, low, mid, n);
			} else
				System.out.println("not found");
		}
	}
}
