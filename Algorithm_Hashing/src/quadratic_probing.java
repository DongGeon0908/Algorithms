
public class quadratic_probing {

	public static void QP(int[] value, int m) {
		String[] table = new String[m];
		int tmp = 0;
		int t_k = 1;
		int t=0;
		for (int i = 0; i < value.length; i++) {
			tmp = value[i] % m;
			if (table[tmp] == null) {
				table[tmp] = Integer.toString(value[i]);
			} else {
				for(;;) {
					t = tmp + (int)Math.pow(t_k, 2);
					if (t < 13) {
						if (table[t] == null) {
							table[t] = Integer.toString(value[i]);
							break;
						}
					} else {
						t = tmp + (int)Math.pow(t_k, 2) - 13;
						if (table[t] == null) {
							table[t] = Integer.toString(value[i]);
							break;
						}
					}
					t_k++;
				}
			}
		}

		for (int k = 0; k < m; k++) {
			System.out.println(k + " : " + table[k]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 해시테이블 크기
		int m = 13;

		// 해시테이블 데이터
		int[] value = { 25, 13, 16, 15, 7, 28, 31, 20, 1, 26 };

		QP(value, m);
	}

}
