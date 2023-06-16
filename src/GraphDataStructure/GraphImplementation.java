package GraphDataStructure;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Graph<T> {
	// creating an object of the Map class that stores the edges of the graph
	private Map<T, List<T>> map = new HashMap<>();

	// the method adds a new vertex to the graph
	public void addNewVertex(T s) {
		map.put(s, new LinkedList<T>());
	}

	// the method adds an edge between source and destination

	public void addNewEdge(T source, T destination, boolean bidirectional) {
		if (!map.containsKey(source)) {
			addNewVertex(source);
		}
		if (!map.containsKey(destination)) {
			addNewVertex(destination);
			map.get(source).add(destination);
		}
		if (bidirectional == true) {
			map.get(destination).add(source);
		}
	}

	// the method counts the number of vertices
	public void countVertice() {
		System.out.println(map.keySet().size());
	}

	// the method counts the number of edges
	public void countEdges(boolean bidirectional) {
		// variable to store number of edges
		int count = 0;
		for (T v : map.keySet()) {
			count = count + map.get(v).size();
		}
		if (bidirectional == true) {
			count = count / 2;
		}
		System.out.println("Total Edges: " + count);
	}

	// checks a graph has vertex or not
	public void containsVertex(T s) {
		if (map.containsKey(s)) {
			System.out.println("The graph contains " + s + " as a vertex.");
		} else {
			System.out.println("The graph does not contain " + s + " as a vertex.");
		}
	}
	// checks a graph has edge or not
	// where s and d are the two parameters that represent source(vertex) and
	// destination (vertex)

	public void containsEdges(T s, T d) {
		if (map.get(s).contains(d)) {
			System.out.println("The graph has an edge between " + s + " and " + d + ".");
		} else {
			System.out.println("There is no edge between " + s + " and " + d + ".");
		}
	}

	// prints the adjacencyS list of each vertex
	// here we have overridden the toString() method of the StringBuilder class
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		// foreach loop that iterates over the keys
		for (T v : map.keySet()) {
			builder.append(v.toString() + ":");
			// foreach loop for getting the vertices
			for (T w : map.get(v)) {
				builder.append(w.toString() + " ");
			}
			builder.append("\n");
		}

		return (builder.toString());
	}
}


//creating a class in which we have implemented the driver code 
public class GraphImplementation {
	public static void main(String[] args) {
		// creating an object of the Graph class
		Graph<Object> g=new Graph<Object>();
		g.addNewEdge(0, 1, true);
		g.addNewEdge(0, 4, true);
		g.addNewEdge(1, 2, true);
		g.addNewEdge(1, 3, false);
		g.addNewEdge(1, 4, true);
		g.addNewEdge(2, 3, true);
		g.addNewEdge(2, 4, true);
		g.addNewEdge(3, 0, true);
		g.addNewEdge(2, 0, true);

		// prints the adjacency matrix that represents the graph
		System.out.println("Adjacency List for the graph:\n" + g.toString());

		// counts the number of vertices in the graph
		g.countVertice();

		// counts the number of edges in the graph
		g.countEdges(true);

		// checks whether an edge is present or not between the two specified vertices
		g.containsEdges(3, 4);
		g.containsEdges(2, 4);

		// checks whether vertex is present or not
		g.containsVertex(3);
		g.containsVertex(5);

	}
}
