package quick_±³¼ö´Ô;

//////////////////////////////////////////////// Quick.java /////////////////////////////////////////////
import java.util.Comparator;

public class Quick {

	private static <T> void swap(T[] a, int i, int j) {
		T tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	private static <T> int partition(T a[], int low, int high, Comparator<T> comparator) {
		int i = low, j = high + 1;
		while (true) {
			while (comparator.compare(a[++i], a[low]) < 0) {
				if (i == high)
					break;
			}
			while (comparator.compare(a[low], a[--j]) < 0) {
				if (j == low)
					break;
			}
			if (i >= j)
				break;
			swap(a, i, j);
		}
		swap(a, low, j);
		return j;
	}

	private static <T> void sort(T[] a, int low, int high, Comparator<T> comparator) {
		if (low >= high)
			return;
		int pivot = partition(a, low, high, comparator);
		sort(a, low, pivot - 1, comparator);
		sort(a, pivot + 1, high, comparator);
	}

	public static <T> void sort(T[] a, Comparator<T> comparator) {
		sort(a, 0, a.length - 1, comparator);
	}
}