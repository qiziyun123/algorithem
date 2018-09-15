package com.qizy.coursea.algorithem.week01.unionFind;

public class WeightedQuickUnion {

	private int[] sets;
	// num of objects at root i
	private int[] extraSets;

	private int count;

	public WeightedQuickUnion(int size) {
		// init
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = i;
		}
		sets = a;
		count = size;
		for (int i = 0; i < size; i++) {
			extraSets[i] = 1;
		}
	}
	
	public boolean connected(int p,int q) {
		return root(p) == root(q);
	}

	private int root(int q) {
		while(q!=sets[q]) {
			q = sets[q];
		}
		return q;
	}
	
	public void union(int p,int q) {
		int rp = root(p);
		int rq = root(q);
		// change root of p to point to root of q

	
	}
	
}
