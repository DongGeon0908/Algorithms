package SymbolTable;

public class SymbolTable_Ordered_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// key 값
		String[] key = { "b", "a", "d", "c" };
		// value 값
		int[] value = { 1, 2, 3, 4 };

		// 출력
		for (int i = 0; i < key.length; i++) {
			System.out.println("key : " + key[i] + " / value : " + value[i]);
		}

		// 정렬
		for (int i = 0; i < key.length - 1; i++) {
			String tmp_1 = null;
			int tmp_2 = 0;
			if (key[i].compareTo(key[i + 1]) == 1) {
				tmp_1 = key[i];
				key[i] = key[i + 1];
				key[i + 1] = tmp_1;

				tmp_2 = value[i];
				value[i] = value[i + 1];
				value[i + 1] = tmp_2;
			}
		}

		// 출력
		for (int i = 0; i < key.length; i++) {
			System.out.println("key : " + key[i] + " / value : " + value[i]);
		}
	}

}
