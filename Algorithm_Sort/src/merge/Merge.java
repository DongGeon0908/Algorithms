package merge;

public class Merge {

	public static void sort(int[] a) {
		int n = a.length;
		int[] aux = new int[n]; // 보조배열
		sort(a, 0, n - 1, aux);
		
	}

	// 재귀 도우미(recursion helper) 함수
	private static void sort(int[] a, int low, int high, int[] aux) {
		if (low >= high) {
			return;
		}
		System.out.println("margeSort(" + low + ", " + high + ")");
		int mid = (low + high) / 2;
		System.out.println("mid = " + mid);
		sort(a, low, mid, aux);
		System.out.println("margeSort(" + low + ", " + mid + ")");
		
		sort(a, mid + 1, high, aux);
		System.out.println("margeSort(" + (mid+1) + ", " + high + ")");
		
		merge(a, low, mid, high, aux);
		
		System.out.print("merge(" + low + ", " + mid + ", " + high + ") --> ");
		for (int i : aux) {
			System.out.print(i +" ");
		}
		System.out.println();
	}

	private static void merge(int[] a, int low, int mid, int high, int[] aux) {
		int i = low;
		int j = mid + 1;
		int k = low;

		while (k <= high) {
			if (i > mid) {
				aux[k++] = a[j++];
			} else if (j > high) {
				aux[k++] = a[i++];
			} else if (a[i] > a[j]) {
				aux[k++] = a[j++];
			} else {
				aux[k++] = a[i++];
			}
		}
		for (k = low; k <= high; k++) {
			a[k] = aux[k];
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dat = { 100,34,189,56,150,140,9,123 };
		Merge.sort(dat);

	}

}
