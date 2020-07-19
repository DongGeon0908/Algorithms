package insert.movie.array;
import java.util.*;

//삽입정렬
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

	// 참조형 자료형들을 정렬하는 함수
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
// OBJECT와 제네릭은 같음.... 성능차이X
	
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
