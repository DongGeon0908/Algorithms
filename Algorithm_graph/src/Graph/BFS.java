package Graph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import ds.*;

public class BFS {
	private boolean[] visited;
	private int[] edgeTo;
	private int st;

	public BFS(Graph G, int s) {
		visited = new boolean[G.V()];
		edgeTo = new int[G.V()];
		this.st = s;
		bfs(G, s);
	}

	private void bfs(Graph G, int s) {
		Queue q = new Queue();
		visited[s] = true;
		q.enqueue(s);
		while (!q.isEmpty()) {
			int v = q.dequeue();
			System.out.println(v);
			for (Object x : G.adj(v)) {
				int w = (int) x;
				if (!visited[w]) {
					edgeTo[w] = v;
					visited[w] = true;
					q.enqueue(w);
				}
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

			BFS bf_search = new BFS(g, 0);
			for (int v = 0; v < g.V(); v++) {
				System.out.println(v + " - " + bf_search.edgeTo(v));
			}
		} catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}
	}
}
