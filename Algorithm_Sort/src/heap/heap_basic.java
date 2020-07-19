package heap;
// ¹Ì¿Ï¼º
public class heap_basic {

	
	public static void heapsort(int[] A, int n) {
		buildHeap(A, n);
		for(int i = n; i >= 1; i--) {
			int tmp = A[0];
			A[0] = A[i];
			A[i] = tmp;
			heapify(A, 0, i-1);
		}
	}
	
	
	public static void buildHeap(int[] A, int n) {
		for (int idx = n / 2; idx >= 0; idx--) {
			heapify(A, idx, n);
		}
	}

	// Max Heap
	public static void heapify(int[] A, int k, int n) {
		int left = 2 * k;
		int right = 2 * k + 1;
		int large = 0;

		if (right <= n) {
			// 2 children
			if (A[left] < A[right]) {
				large = left;
			} else {
				large = right;
			}
		}

		else if (left <= n) {

			large = left;
		}
		else {
			return;
		}
		if (A[large] < A[k]) {
			int tmp = A[k];
			A[k] = A[large];
			A[large] = tmp;
			tmp = 0;
			heapify(A, large, n);
		}

	}



	public static void main(String[] args) {
		int[] A = { 23,56,11,9,56,99,27,34 };
		buildHeap(A, A.length - 1);

		for (int num : A) {
			System.out.println(", " + num);
		}

	}
}
