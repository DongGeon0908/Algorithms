
public class double_hashing {

	public static void DH(int[] value, int m) {
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
					t = (tmp + 7-(value[i]%7))*t_k;
					if (t < 13) {
						if (table[t] == null) {
							table[t] = Integer.toString(value[i]);
							break;
						}
					} else {
						t = (tmp + 7-(value[i]%7) - 13)*t_k;
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
		// �ؽ����̺� ũ��
		int m = 13;

		// �ؽ����̺� ������
		int[] value = { 25, 13, 16, 15, 7, 28, 31, 20, 1, 26 };

		DH(value, m);
	}

}