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
	
	
	public static  List<Vertex> dijkstra(Graph graph, Vertex a)
	{
		/*
		 * The algorihtm grow a section of the graph where the SSSP property is always valid.
		 * S = starting vertex a, cost to reach the vertex a is null
		 * at every iteration looking for the the vertex outside of the edge that minimize the global distance (distance to reach the previous node + cost of the edge)
		 */
		
		int n = graph.numVertices();
		
		List<Vertex> s = new Vector<Vertex>();
		a.setCost(0);
		a.setPred(null);
		a.setVisited(true);
		s.add(a);
		
		while (s.size()!= n)
		{
			int min = Integer.MAX_VALUE;
			Vertex newVisitedVertex = null;
			//for each element in s
			for (int i=0;i<s.size();i++)
			{
				Vertex v = s.get(i);
				System.out.println("selecting vertex "+v.getO()+" in S.");
				List<Edge> edges = graph.incidendEdges(v);
				for (Edge e : edges)
				{
					Vertex opposite = graph.opposite(v, e);
					if (!opposite.getVisited())
					{
						int cost = v.getCost()+ e.getO();
						if (cost<min)
						{
							newVisitedVertex = opposite;
							newVisitedVertex.setPred(v);
							min = cost;

						}
					}
				}
				
			}
			
			newVisitedVertex.setVisited(true);
			newVisitedVertex.setCost(min);

			s.add(newVisitedVertex);
			System.out.println("s size is "+s.size());
		}
		
		return s;
	}
	
	
	public static void floydWarschall(Graph graph, Integer[][] costs, Integer [][] pred)
	{
		//find all shortest paths among every couple of vertex
		//at every iteration consider 3 vertex, and finds the min path between i and j using just vertices till index h.
		
		//initialize, prec i, j is i
		
		List<Vertex> vertices = graph.vertices();
		int n = graph.numVertices();
		
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				pred[i][j]=i;
			}
		}
		
		//initialize costs for i,j if i=j 0, if there is a edge, the cost of the edge otherwise infinite
		
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				Vertex vi = vertices.get(i);
				Vertex vj = vertices.get(j);

				if (i==j) costs[i][j]=0;
				else if (graph.areAdjacent(vi, vj))
				{
					Edge edge = graph.getEdge(vi, vj);
					costs[i][j]=edge.getO();
				}
				else
				{
				//	costs[i][j]=Integer.MAX_VALUE;
					costs[i][j]=100;
				}
			}
		}
		
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				System.out.println("costs "+(i+1)+","+(j+1)+" = "+costs[i][j]);
			}
		}
		
		
		//3 cycles
		
		for (int h=0;h<n;h++)
		{
			for (int i=0;i<n;i++)
			{
				for (int j=0;j<n;j++)
				{
					
					int cost = costs[i][h]+costs[h][j];
					if (cost<costs[i][j])
					{
						costs[i][j] = cost;
						pred[i][j] = pred [h][j];
					}
					
				}
			}
		}
	}
	
	
	// floyd warschall
	
	// minimum spanning tree
	
	// A * ?
}
