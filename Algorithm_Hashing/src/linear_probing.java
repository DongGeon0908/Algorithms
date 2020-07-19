
public class linear_probing {

	public static void LP(int[] value, int m) {
		String[] table = new String[m];
		int tmp = 0;
		for (int i = 0; i < value.length; i++) {
			tmp = value[i] % m;
			if (table[tmp] == null) {
				table[tmp] = Integer.toString(value[i]);
			} else {
				for (int j = tmp + 1; j < m; j++) {
					if (table[j] == null) {
						table[j] = Integer.toString(value[i]);
						break;
					}
					if (j == 12) {
						j = 0;
					}
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

		LP(value, m);

	}

}
