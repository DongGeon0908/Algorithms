package quick.movie.textfile;

import java.util.Comparator;

public class quickSort {

	//quicksort �̸����� ����
	public static void sort(Comparable[] a, int low, int high) {

		if (low >= high) {
			return;
		}

		int i = low;
		int j = high + 1;
		Comparable tmp;
		while (true) {

			while (a[low].compareTo(a[++i]) > 0) {
				if (i == high) {
					break;
				}
			}

			while (a[--j].compareTo(a[low]) > 0) {
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
		int pivot = j;

		sort(a, low, pivot - 1);
		sort(a, pivot + 1, high);

	}

	//����   // ���� ->�̸� �Ѵ� ��밡��!(Comparator comparator�� �ν��Ͻ��� �ٲ��ָ� �˴ϴ�
	public static <T> void sort(T[] a, int low, int high, Comparator comparator) {

		if (low >= high) {
			return;
		}

		int i = low;
		int j = high + 1;
		T tmp;
		while (true) {

			while (comparator.compare(a[low], a[++i]) > 0) {
				if (i == high) {
					break;
				}
			}

			while (comparator.compare(a[--j], a[low]) > 0) {
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
		int pivot = j;

		sort(a, low, pivot - 1, comparator);
		sort(a, pivot + 1, high, comparator);

	}

}
