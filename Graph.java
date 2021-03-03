import java.util.*;
import java.util.Queue;

public class Graph {

	// add edge
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int a, int b) {
		adj.get(a).add(b);
		adj.get(b).add(a);

	}

	// print graph
	static void printGraph(ArrayList<ArrayList<Integer>> a) {
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < a.get(i).size(); j++) {
				System.out.print(a.get(i).get(j) + " ");
			}
			System.out.println();
		}

	}

	// dfs traversal of an array
	static void dfs(ArrayList<ArrayList<Integer>> adj, int s, boolean arr[]) {
		arr[s] = true;
		System.out.print(s + " ");

		for (int v : adj.get(s)) {
			if (arr[v] == false) {
				dfs(adj, v, arr);
			}
		}

	}

	static void dfsTraversal(ArrayList<ArrayList<Integer>> adj, int s, int V) {
		boolean arr[] = new boolean[V];
		dfs(adj, s, arr);
	}

	// bfs Traversal
	static void bfs(ArrayList<ArrayList<Integer>> a, int V, int s) {
		boolean visited[] = new boolean[V];

		Queue<Integer> q = new LinkedList<>();
		visited[s] = true;
		q.add(s);
		while (q.isEmpty() == false) {
			int u = q.poll();
			System.out.print(u + " ");

			for (int v : a.get(u)) {
				if (visited[v] == false) {
					visited[v] = true;
					q.add(v);
				}
			}

		}

	}

	// no of islands using bfs
	static void callBfs(ArrayList<ArrayList<Integer>> adj, boolean visited[], int s) {
		Queue<Integer> q = new LinkedList<>();
		visited[s] = true;
		q.add(s);

		while (q.isEmpty() == false) {

			int u = q.poll();

			for (int v : adj.get(u)) {
				if (visited[v] == false) {
					visited[v] = true;
					q.add(v);

				}
			}
		}

	}

	static int bfs(ArrayList<ArrayList<Integer>> adj, int V) {
		boolean visited[] = new boolean[V];
		int count = 0;
		for (int i = 0; i < V; i++) {
			if (visited[i] == false) {
				callBfs(adj, visited, i);
				count++;
			}

		}
		return count;
	}

	// no of disconected components
	static void callDfs(ArrayList<ArrayList<Integer>> adj, boolean visited[], int s) {
		visited[s] = true;

		for (int v : adj.get(s)) {
			if (visited[v] == false)
				callDfs(adj, visited, v);
		}

	}

	static int noDisconects(ArrayList<ArrayList<Integer>> adj, int V) {
		boolean arr[] = new boolean[V];
		int count = 0;
		for (int i = 0; i < V; i++) {
			if (arr[i] == false) {
				callDfs(adj, arr, i);
				count++;
			}

		}
		return count;
	}

	public static void main(String arg[]) {
		int V = 7;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

		for (int i = 0; i < V; i++)
			adj.add(new ArrayList<Integer>());

		addEdge(adj, 0, 1);
		addEdge(adj, 0, 2);
		addEdge(adj, 2, 3);
		addEdge(adj, 1, 3);
		addEdge(adj, 4, 5);
		addEdge(adj, 5, 6);
		addEdge(adj, 4, 6);
		System.out.println(noDisconects(adj, V));

		// dfsTraversal(a,1,v);
	}

}
