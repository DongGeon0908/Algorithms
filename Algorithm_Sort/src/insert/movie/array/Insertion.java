package insert.movie.array;
import java.util.*;

//��������
public class Insertion {
	private Insertion() {
	}

	public static void sort(double[] a) {
		int n = a.length;
		int i, j;
		double key;

		for (i = 1; i < n; i++) {
			key = a[i];
			j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
	}

	// ������ �ڷ������� �����ϴ� �Լ�
	public static void sort(Comparable[] a) {
		int n = a.length;
		int i, j;
		Comparable key;

		for (i = 1; i < n; i++) {
			key = a[i];
			j = i - 1;
			while (j >= 0 && a[j].compareTo(key) > 0) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
	}

//	public static void sort(Object[] a, Comparator comparator) {
//		int n = a.length;
//		int i, j;
//		Object key;
//
//		for (i = 1; i < n; i++) {
//			key = a[i];
//			j = i - 1;
//			while (j >= 0 && comparator.compare(a[j], key) > 0) {
//				a[j + 1] = a[j];
//				j--;
//			}
//			a[j + 1] = key;
//		}
//
//	}
// OBJECT�� ���׸��� ����.... ��������X
	
	public static <T> void sort(T[] a, Comparator comparator) {
		int n = a.length;
		int i, j;
		T key;

		for (i = 1; i < n; i++) {
			key = a[i];
			j = i - 1;
			while (j >= 0 && comparator.compare(a[j], key) > 0) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}

	}
}
