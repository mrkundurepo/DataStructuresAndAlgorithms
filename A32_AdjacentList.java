// Adjacency List representation (undirected graph)
public class A32_AdjacentList{
	private LinkedList<Integer>[] adj;
	private int V; // Number of vertices
	private int E; // Number of edges
	public A32_AdjacentList(int nodes){
		this.V=nodes;
		this.E=0;
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
			sb.append(v+" : ");
			for(int w: adj[v]){
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	public static void main(String[] args){
		A32_AdjacentList al = new A32_AdjacentList(4);
		al.addEdge(0,1);
		al.addEdge(1,2);
		al.addEdge(2,3);
		al.addEdge(3,0);
		System.out.println(al);
	}
}