//int형 반환

package quick;

public class quicksort_basic {

	public static int partition(int a[], int low, int high) {

		int i = low;
		int j = high + 1;
		int tmp;
		while (true) {
			while (a[++i] < a[low]) {
				if (i == high) {
					break;
				}
			}
			while (a[low] < a[--j]) {
				if (i == low) {
					break;
				}
			}
			if (i >= j) {
				break;
			}
			tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;

		}
		tmp = a[low];
		a[low] = a[j];
		a[j] = tmp;
		return j;

	}

	public static void sort(int a[], int low, int high) {

		System.out.println();
		System.out.println("qs(" + low + ", " + (high) + ")");
		if (low >= high) {
			return;
		}

		int pivot = partition(a, low, high);
		System.out.print("partition(" + low + ", " + high + ")---->" + "pivot값 : " + pivot + " 반환");
		for (int num : a) {
			System.out.print("  " + num);
		}

		sort(a, low, pivot - 1);

		sort(a, pivot + 1, high);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 100, 34, 189, 56, 150, 140, 9, 123 };
		int b[] = { 15, 22, 13, 27, 12, 10, 20, 25 };

		System.out.print(" 초기값   -->");
		for (int num : a) {
			System.out.print(" " + num);

		}

		System.out.println();
		sort(a, 0, a.length - 1);
		System.out.println();

		System.out.print(" 마지막 정렬  -->");

		for (int num : a) {
			System.out.print("  " + num);
		}

	}

}
