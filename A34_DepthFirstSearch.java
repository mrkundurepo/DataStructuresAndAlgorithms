// Depth First Search
import java.util.LinkedList;
public class A34_DepthFirstSearch{
	private LinkedList<Integer>[] adj;
	private int V; // number of vertices
	private int E; // number of edges
	public A34_DepthFirstSearch(int nodes){
		this.V = nodes;
		this.E = 0;
		this.adj = new LinkedList[nodes];
		for(int v=0; v<V; v++){
			adj[v]=new LinkedList<>();
		}
	}
	public void addEdge(int u, int v){
		adj[u].add(v);
		adj[v].add(u);
		E++;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(V + "vertices, " + E + " edges "+"\n");
		for(int v=0; v<V; v++){
			sb.append(v + " : ");
			for(int w: adj[v]){
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	public void bfs(int s){
		boolean[] visited  = new boolean[V];
		Queue<Integer> q = new LinkedList<>();
		visited[s]=true;
		q.offer(s);
		while(!q.isEmpty()){
			int u = q.poll();
			System.out.print(u + " ");
			for(int v: adj[u]){
				if(!visited[v]){
					visited[v] = true;
					q.offer(v);
				}
			}
		}
	}
	public void dfs(int s){
		boolean[] visited = new boolean[v];
		Stack<Integer> stack = new Stack<>();
		stack.push(s);
		while(!stack.isEmpty()){
			int u = stack.pop();
			if(!visited[u]){
				visited[u] = true;
				Sytem.out.print(u+" ");
				for(int v: adj[u]){
					if(!visited[v]){
						stack.push(v);
					}
				}
			}
		}
	}
	// Recursive depth first search (undirected graph)
	public void dfs(){
		boolean[] visited = new boolean[V];
		for(int v=0; v<V; v++){
			if(!visited[v]){
				dfs(v,visited);
			}
		}
	}
	public void dfs(int v, boolean[] visited){
		visited[v] = true;
		System.out.print(v+" ");
		for(int w: adj[v]){
			if(!visited[w]){
				dfs(w, visited);
			}
		}
	}
	// connected components (undirected graph)
	public void dfs2(){
		boolean[] visited = new boolean[V];
		int[] compId = new int[V];
		int count=0;
		for(int v=0; v<V; v++){
			if(!visited[v]){
				dfs(v, visited, compId, count);
				count++;
			}
		}
	}
	public void dfs2(int v, boolean[] visited, int[] compId, int count){
		visted[v] = true;
		compId[v] = count;
		for(int w: adj[v]){
			if(!visited[w]){
				dfs(w, visited, compId, count);
			}
		}
	}
	public static void main(String[] args){
		A34_DepthFirstSearch dfs = new A34_DepthFirstSearch(5);
		dfs.addEdge(0,1);
		dfs.addEdge(1,2);
		dfs.addEdge(2,3);
		dfs.addEdge(3,0);
		dfs.addEdge(2,4);								
		dfs.bfs(0);
		dfs.dfs(0);
		System.out.println(dfs);	
	}
}