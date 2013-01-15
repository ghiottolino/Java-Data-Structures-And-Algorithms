package com.nicolatesser.v1.datastructure_algorithms.datastructures.btree.linked_structure;

import java.util.List;

import com.nicolatesser.v1.datastructure_algorithms.datastructures.btree.BPosition;
import com.nicolatesser.v1.datastructure_algorithms.datastructures.btree.BTree;

public class LinkedStructureBTree implements BTree {
	
	private BNode root;
	
	public LinkedStructureBTree()
	{
		this.root=null;
	}
	

	@Override
	public boolean isExternal(BPosition p) {
		BNode node = (BNode)p;
		return ((node.getLeftChild()==null)&&(node.getRightChild()==null));
	}

	@Override
	public boolean isInternal(BPosition p) {
		BNode node = (BNode)p;
		return ((node.getLeftChild()!=null)||(node.getRightChild()!=null));
	}

	@Override
	public boolean isRoot(BPosition p) {
		BNode node = (BNode)p;
		return node == this.root;
	}

	@Override
	public BPosition parent(BPosition p) {
		BNode node = (BNode)p;
		return node.getParent();
	}

	@Override
	public BPosition root() {
		return this.root;
	}
	
	@Override
	public void setRoot(BPosition p)
	{
		this.root=(BNode)p;
	}


	@Override
	public BPosition leftChild(BPosition p) {
		BNode node = (BNode)p;
		return node.getLeftChild();
	}


	@Override
	public BPosition rightChild(BPosition p) {
		BNode node = (BNode)p;
		return node.getRightChild();
	}

}
