package com.nicolatesser.datastructure_algorithms.datastructures.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Vector;

public class GraphAlgorithms {
	
	
	public static List<Vertex> breadthFirstSearch (Graph graph, Vertex a)
	{
		
		Queue<Vertex> queue = new LinkedList<Vertex>();
		queue.add(a);
		
		return GraphAlgorithms.breadthFirstSearch(graph, queue);
	}
	
	
	private static List<Vertex> breadthFirstSearch (Graph graph, Queue<Vertex> q)
	{
		List<Vertex> bfsVertices = new Vector<Vertex>();
		
		while (!q.isEmpty())
		{
			Vertex v = q.poll();
			v.setVisited(true);
			bfsVertices.add(v);
			
			List<Vertex> adjacentVertices = graph.adjacentVertices(v);
			for (Vertex adjacent : adjacentVertices)
			{
				if ((!adjacent.getVisited())&&(!q.contains(adjacent)))
				{
					q.add(adjacent);
				}
			}
		}
		return bfsVertices;
	}
	

	public static List<Vertex> depthFirstSearch (Graph graph, Vertex a)
	{
		List<Vertex> dfsVertices = new Vector<Vertex>();
		if (a.getVisited()) return dfsVertices;
		
		a.setVisited(true);
		dfsVertices.add(a);
		
		System.out.println("vertex is "+a.getO());
		
		List<Vertex> adjacentVertices = graph.adjacentVertices(a);
		for (Vertex adjacent : adjacentVertices)
		{
			System.out.println("adjacent vertex is "+adjacent.getO()+ "visited = "+adjacent.getVisited());
			if (!adjacent.getVisited())
			{
			   dfsVertices.addAll(depthFirstSearch(graph, adjacent));
			}
		}
		return dfsVertices;
	}
	
	
	// djastra
	
	// floyd warschall
	
	// minimum spanning tree
	
	// A * ?
}
