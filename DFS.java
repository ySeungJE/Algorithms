
public class DFS {
	public static boolean[] visit;
	public static int[][] graph = {{},
	        {2, 3, 8},
	        {1, 7},
	        {1, 4, 5},
	        {3, 5},
	        {3, 4},
	        {7},
	        {2, 6, 8},
	        {1, 7}};
	public static void main(String[] args) {
		visit = new boolean[10];
		dfs(1);
	}

	public static void dfs(int v) {
		visit[v] = true;
		System.out.print(v + " ");
		for (int i : graph[v]){
            if (visit[i]==false){
                dfs(i);
            }
        }
	}
}
