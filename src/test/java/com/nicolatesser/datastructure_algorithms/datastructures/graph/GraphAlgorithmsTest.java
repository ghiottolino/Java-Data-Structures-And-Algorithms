package com.nicolatesser.datastructure_algorithms.datastructures.graph;

import static org.junit.Assert.*;

import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.nicolatesser.datastructure_algorithms.datastructures.graph.adjacency_list.AdjacencyListGraph;

public class GraphAlgorithmsTest {

	private Graph graph;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.graph = new AdjacencyListGraph();
	}

	@Test
	public void testBreadthFirstSearch() {
		//Prepare
		makeTestGraph();

		//Execute
		List<Vertex> breadthFirstSearch = GraphAlgorithms.breadthFirstSearch(graph, graph.aVertex());
		
		//Verify
		for (int i=0;i<breadthFirstSearch.size();i++)
		{
			System.out.println("i="+i+",="+breadthFirstSearch.get(i).getO());
		}
		Assert.assertEquals(8, breadthFirstSearch.size());
		Assert.assertEquals(new Integer(1), breadthFirstSearch.get(0).getO());
		Assert.assertEquals(new Integer(2), breadthFirstSearch.get(1).getO());
		Assert.assertEquals(new Integer(3), breadthFirstSearch.get(2).getO());
		Assert.assertEquals(new Integer(4), breadthFirstSearch.get(3).getO());
		Assert.assertEquals(new Integer(5), breadthFirstSearch.get(4).getO());
		Assert.assertEquals(new Integer(6), breadthFirstSearch.get(5).getO());
		Assert.assertEquals(new Integer(8), breadthFirstSearch.get(6).getO());
		Assert.assertEquals(new Integer(7), breadthFirstSearch.get(7).getO());


	}

	@Test
	public void testDepthFirstSearch() {
		//Prepare
		makeTestGraph();
		
		//Execute
		List<Vertex> depthFirstSearch = GraphAlgorithms.depthFirstSearch(graph, graph.aVertex());
		
		//Verify
		for (int i=0;i<depthFirstSearch.size();i++)
		{
			System.out.println("i="+i+",="+depthFirstSearch.get(i).getO());
		}
		Assert.assertEquals(8, depthFirstSearch.size());
		Assert.assertEquals(new Integer(1), depthFirstSearch.get(0).getO());
		Assert.assertEquals(new Integer(2), depthFirstSearch.get(1).getO());
		Assert.assertEquals(new Integer(4), depthFirstSearch.get(2).getO());
		Assert.assertEquals(new Integer(5), depthFirstSearch.get(3).getO());
		Assert.assertEquals(new Integer(3), depthFirstSearch.get(4).getO());
		Assert.assertEquals(new Integer(6), depthFirstSearch.get(5).getO());
		Assert.assertEquals(new Integer(7), depthFirstSearch.get(6).getO());
		Assert.assertEquals(new Integer(8), depthFirstSearch.get(7).getO());
			
	}
	
	
	
	public void makeTestGraph()
	{
		//Creating this graph
		// V = 1,2,3,4
		// E = [1,2],[1,3,],[1,4],[2,4]
		//Inserting vertices
		Vertex v1 = graph.insertVertex(1);
		Vertex v2 = graph.insertVertex(2);
		Vertex v3 = graph.insertVertex(3);
		Vertex v4 = graph.insertVertex(4);
		Vertex v5 = graph.insertVertex(5);
		Vertex v6 = graph.insertVertex(6);
		Vertex v7 = graph.insertVertex(7);
		Vertex v8 = graph.insertVertex(8);
		//edges
		graph.insertEdge(v1, v2, 1);
		graph.insertEdge(v1, v3, 3);
		graph.insertEdge(v1, v4, 2);
		graph.insertEdge(v2, v4, 1);
		graph.insertEdge(v3, v5, 2);
		graph.insertEdge(v3, v6, 1);
		graph.insertEdge(v4, v5, 4);
		graph.insertEdge(v4, v6, 2);
		
		graph.insertEdge(v5, v6, 1);
		
		
		graph.insertEdge(v5, v8, 2);
		graph.insertEdge(v6, v7, 1);
		
		
	}

}
