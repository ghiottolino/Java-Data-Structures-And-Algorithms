package com.nicolatesser.datastructure_algorithms.datastructures.graph;

import java.util.List;
import java.util.Vector;

public class Vertex {
	
	private List<Edge> edges;
	
	private Integer o;
	
	
	
	public Vertex(int o)
	{
		this.o=o;
		this.edges = new Vector<Edge>();
	}
	
	public void addEdge(Edge e)
	{
		edges.add(e);
	}
	
	public List<Edge> getEdges()
	{
		return this.edges;
	}

	public Integer getO() {
		return o;
	}

	public void setO(Integer o) {
		this.o = o;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}
	
	
	

}
