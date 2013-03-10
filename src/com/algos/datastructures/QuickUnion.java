package com.algos.datastructures;

public class QuickUnion {
	
	private int[] id;
	
	public QuickUnion(int n){
		id = new int[n];
		for(int i = 0; i < n; i++)
			id[i]=i;
	}
	
	private int root(int i){
		while(i!=id[i]) i = id[i];
		return i;
	}
	
	public void union(int p , int q){
		int rootp = root(p);
		int rootq = root(q);
		id[rootp] = rootq;
	}

	public boolean connected(int p,int q){
		return root(p)==root(q);
	}

}
