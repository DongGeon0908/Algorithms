package Graph;
public class KruskalMST {
	
	public static void kruskal(int[][] e, int n, int[][] t) {
		//e[][]은 간선을 오름차순으로 정렬한 배열, n은 정점이 수, t[][]는 선택된 간선을 저장하는 배열
		
		int edgCount = 0; // 현재 추가된 간선의 수
		int i = 0; // e[][]배열을 순회하기위한 변수
		int v1, v2; // 선택된 정점의 임시 저장 변수
		int s1, s2; // 같은 서브 트리인지 확인하기 위한 변수
		int[] s = {0,1,2,3,4,5};
		
		while(edgCount < n-1) { //선택된 간선의 수가 n-1보다 작은 즉 간선을  n-1개 선택
			v1 = e[i][0]; // i번째 가중치를 가진 간선의 첫번째 정점 
			v2 = e[i][1]; // i번재 가중치를 가진 정점의 두번째 정점
			s1 = s[v1]; // 해당 정점이 속한 서브트리를 확인
			s2 = s[v2]; // 해당 정점이 속한 서브트리를 확인
						
			if(s1 != s2) { // 선택된 두 정점의 서브트리가 다르다면 실행
				
				for(int j = 0; j < s.length; j++) { //s2가 속한 서브트리를 전부 s1이 속한 서브트리로 합친다.
					if(s[j] == s2) {
						s[j] = s1;
					}
				}
				
				t[edgCount][0] = v1; // 선택된 두 정점의 간선을 저장
				t[edgCount][1] = v2; 
				edgCount++; // 선택된 간선의 수를 증가
			}
			i++; //그 다음 가중치를 가진 간선을 선택하기 위해 증가
		}
	}
	
	public static void main(String[] args) {
		int[][] e = {{3,4}, {2,3}, {2,4}, {0,1}, {0,2}, {1,2}, {0,5}, {0,4}, {4,5}};
		int[][] t = new int[5][2];
		
		kruskal(e,6,t);
		
		for(int i = 0; i < t.length; i++) {
			System.out.println(t[i][0]+1 + " " + (t[i][1]+1));
		}
	}
}

