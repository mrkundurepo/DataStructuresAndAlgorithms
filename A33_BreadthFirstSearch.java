// Breadth First Search
import java.util.LinkedList;
public class A33_BreadthFirstSearch{
	private LinkedList<Integer>[] adj;
	private int V; 	// Number of vertices
	private int E;	// Number of edges
	public A33_BreadthFirstSearch(iny nodes){
		this.V = node;
		this.E = 0;
		this.adj = new LinkedList[nodes];
		for(int v=0; v<V; v++){
			adj[v] = new LinkedList<>();
		}
	}
	public void addEdge(int u, int v){
		adj[u].add(v);
		adj[v].add(u);
		E++;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(V + " vertices, " + E + " edges " + "\n");
		for(int v=0; v<V; v++){
			sb.append(v + ": ");
			for(int w: adj[v]){
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	public void bfs(int s){
		boolean[] visited = new boolean[V];
		Queue<Integer> q = new LinkedList<>();
		visited[s] = true;
		q.offer(s);
		while(!q.isEmpty()){
			int u = q.poll();
			System.out.print(u + " ");
			for(int v: adj[u]){
				if(!visited[v]){
					visited[v]=true;
					q.offer(v);
				}
			}
		}
	}
	public static void main(String[] args){
		A33_BreadthFirstSearch bfs = new A33_BreadthFirstSearch(5);
		bfs.addEdge(0,1);
		bfs.addEdge(1,2);
		bfs.addEdge(2,3);		
		bfs.addEdge(3,0);
		bfs.addEdge(2,4);
		System.out.println(bfs);		
	}
}