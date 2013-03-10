package com.algos.clients;

import com.algos.datastructures.QuickFind;

public class QuickFindClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		QuickFind qfClient = new QuickFind(10);
		
		qfClient.union(0, 5);
		qfClient.union(5, 7);
		qfClient.union(7, 9);
		
		System.out.println(qfClient.connected(1, 9));
		System.out.println(qfClient.connected(0, 9));
		
		qfClient.union(1, 5);
		qfClient.union(5, 9);
		
		System.out.println(qfClient.connected(1, 9));
		
	}

}
