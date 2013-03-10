package com.algos.datastructures;

public class QuickFind {

	private int[] id;
	
	public QuickFind(int n){
		id = new int[n];
		for(int i=0;i<n;i++)
			id[i]=i;
	}
	
	/**
	 * Union of p and q changes id of all the elements who have id's equal to p to id of q 
	 * so that all the connected components have same id
	 * Caution: Takes time proportional to N^2  to perform N union operations on sequence of N objects
	 * @param p
	 * @param q
	 */
	public void union(int p,int q){
		int pid = id[p];
		int qid = id[q];
		for(int i = 0;i<id.length;i++)
			if(id[i] == pid)id[i]=qid;
	}
	
	/**
	 * Object p and q are connected if they have same id (That is why QuickFind)
	 * @param p
	 * @param q
	 * @return
	 */
	public boolean connected(int p,int q){
		return id[p]==id[q];
	}
	
}
