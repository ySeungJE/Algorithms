
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	public static int[][] graph = {{},
	        {2, 3, 8},
	        {1, 7},
	        {1, 4, 5},
	        {3, 5},
	        {3, 4},
	        {7},
	        {2, 6, 8},
	        {1, 7}};

	public static boolean[] visited = new boolean[10];
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		int start = 1;
		queue.add(start);
		
		visited[start] = true;

		while (!queue.isEmpty()) {
			int v = queue.poll();
			System.out.print(v + " ");
			for (int i : graph[v]) {
				if (visited[i] == false) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}
}
