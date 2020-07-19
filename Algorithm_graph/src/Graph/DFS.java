package Graph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DFS {
	private boolean[] visited; // 방문을 한 정점인지 표시
	private int[] edgeTo; // 간선에 포함된 정점
	private int st;

	public DFS(Graph G, int s) {
		visited = new boolean[G.V()];
		edgeTo = new int[G.V()];
		this.st = s;
		dfs(G, s);
	}

	private void dfs(Graph G, int v) {
		visited[v] = true;
		System.out.println(v);
		for (Object x : G.adj(v)) {
			int w = (int) x;
			if (!visited[w]) {
				edgeTo[w] = v;
				dfs(G, w);
			}
		}
	}

	public int edgeTo(int v) {
		return edgeTo[v];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = "Graph_2.txt";
		BufferedReader in = null;
		Graph g;
		String line;
		int V;
		int E;
		try {
			in = new BufferedReader(new FileReader(fname));
			V = Integer.parseInt(in.readLine());
			E = Integer.parseInt(in.readLine());
			g = new Graph(V);
			for (int i = 0; i < E; i++) {
				String[] vs = new String[2];
				line = in.readLine();
				vs = line.split(" ");
				g.addEdge(Integer.parseInt(vs[0]), Integer.parseInt(vs[1]));
			}
			in.close();

			DFS df_search = new DFS(g, 0);
			for (int v = 0; v < g.V(); v++) {
				System.out.println(v + " - " + df_search.edgeTo(v));
			}
		} catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}
	}
}
