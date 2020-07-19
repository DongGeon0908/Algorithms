package Graph;

import java.io.FileNotFoundException;

/** * 최단거리 신장트리 생성을 위한 프림 알고리즘 구현 * * @author whitebeard-k * */
public class PrimMST {
	public static void main(String[] args) throws FileNotFoundException {
		int n = 5;
		int[][] graphs = { { 0, 1, 6, 7, 5 }, { 1, 0, 2, 9, 8 }, { 6, 2, 0, 3, 10 }, { 7, 9, 3, 0, 4 },
				{ 5, 8, 10, 4, 0 } };
		int[] connected = new int[n]; // 연결여부 확인
		connected[0] = 1; // 0번 노드부터 시작
		int min = prim(graphs, connected, 0, 1);
		System.out.println(min);
	}

	public static int prim(int[][] graphs, int[] connected, int value, int count) {
		// 모든 노드를 방문하면 종료
		if (count == connected.length)
			return value;
		int to = -1;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < connected.length; i++) {
			if (connected[i] == 1) {

				// 현재 간선이 연결되어 있으면 처리
				for (int j = 0; j < graphs.length; j++) {
					// 현재 연결된 간선들과 연결된 노드중 최소값을 가지는 간선
					if (connected[j] == 0 && graphs[i][j] != 0 && min > graphs[i][j]) {
						to = j;
						min = graphs[i][j];
					}
				}
			}
		}
		connected[to] = 1; // 최소값 간선을 선택
		value += min;
		// 최소값 추가
		count++; // 연결된 간선 개수 추가
		return prim(graphs, connected, value, count);
	}
}
