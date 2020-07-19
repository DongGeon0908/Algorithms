package Graph;

import java.io.FileNotFoundException;

/** * �ִܰŸ� ����Ʈ�� ������ ���� ���� �˰��� ���� * * @author whitebeard-k * */
public class PrimMST {
	public static void main(String[] args) throws FileNotFoundException {
		int n = 5;
		int[][] graphs = { { 0, 1, 6, 7, 5 }, { 1, 0, 2, 9, 8 }, { 6, 2, 0, 3, 10 }, { 7, 9, 3, 0, 4 },
				{ 5, 8, 10, 4, 0 } };
		int[] connected = new int[n]; // ���Ῡ�� Ȯ��
		connected[0] = 1; // 0�� ������ ����
		int min = prim(graphs, connected, 0, 1);
		System.out.println(min);
	}

	public static int prim(int[][] graphs, int[] connected, int value, int count) {
		// ��� ��带 �湮�ϸ� ����
		if (count == connected.length)
			return value;
		int to = -1;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < connected.length; i++) {
			if (connected[i] == 1) {

				// ���� ������ ����Ǿ� ������ ó��
				for (int j = 0; j < graphs.length; j++) {
					// ���� ����� ������� ����� ����� �ּҰ��� ������ ����
					if (connected[j] == 0 && graphs[i][j] != 0 && min > graphs[i][j]) {
						to = j;
						min = graphs[i][j];
					}
				}
			}
		}
		connected[to] = 1; // �ּҰ� ������ ����
		value += min;
		// �ּҰ� �߰�
		count++; // ����� ���� ���� �߰�
		return prim(graphs, connected, value, count);
	}
}
