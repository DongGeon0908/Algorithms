package bubble;
import java.util.Random;

public class bubble_basic {
// ������ Ǯ�� ��������
	public static void sort(int[] a) {

		int n = a.length;

		for (int i = n - 1; i > 0; i--) {  //  ���� for���� �ִ� ������ ���� for���� �ִ� ������ ��� �ݺ��� �������� ���� ������ 
			for (int j = 0; j < i; j++) {  
				if (a[j] > a[j + 1]) {     
					int tmp = a[j];        
					a[j] = a[j + 1];       
					a[j + 1] = tmp;        
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 100000;
		int[] data = new int[n];
		Random rand = new Random();

		for (int i = 0; i < n; i++) {
			data[i] = rand.nextInt(100);
		}

		long start = System.currentTimeMillis();
		bubble_basic.sort(data);
//		for (int i = 0; i < data.length; i++) {
//			System.out.println(data[i]);
//		}

		long end = System.currentTimeMillis();

		double elapsed = (end - start) / 1000.0;

		System.out.println(n + "=" + elapsed + "seconds");
	}

}
