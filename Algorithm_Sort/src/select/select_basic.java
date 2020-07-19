package select;

public class select_basic {

	public static void selectionSort(int array[], int num) {
		for (int i = num; i >= 1; i--) {
			int k = Largest(array, i);
			int tmp = array[i];
			array[i] = array[k];
			array[k] = tmp;
		}

	}

	public static int Largest(int array[], int num) {
		int largest = 0;

		for (int i = 1; i <= num; i++) {
			if (array[i] > array[largest]) {
				largest = i;
			}
		}

		return largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1[] = {19,7, 2, 3, 99, 33, 44 };

		selectionSort(num1, num1.length-1);

		for (int i : num1) {
			System.out.println(" , " + i);
		}

	}

}
