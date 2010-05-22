// $Id:$

package com.nicolatesser.datastructure_algorithms.datastructures.graph;

import java.util.Iterator;

/**
 * @author ntesser
 * 
 */
public interface Graph
{
	
	public int numVertices();
	
	public int numEdges();
	
	public Iterator<Vertex> vertices();
	
	public Iterator<Edge> edges();
	
	public Vertex aVertex();
	
	public int degree(Vertex v);
	
	public Iterator<Vertex> adjacentVertices(Vertex v);
	
	public Iterator<Edge> incidendEdges(Vertex v);
	
	public Vertex[]endVertices (Edge e);
	
	public Vertex opposite (Vertex v, Edge e);
	
	public boolean areAdjacent (Vertex v, Vertex w);

}
