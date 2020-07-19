
public class Max {
	public static double max(double[] a) {
		int n = a.length;
		double tmp = a[0];
		for (int i = 1; i < n; i++)
			if (a[i] > tmp)
				tmp = a[i];
		return tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = { 1, 5, 7, 22, 56 };
		System.out.println("�ִ밪 : " + max(a));
	}

}
