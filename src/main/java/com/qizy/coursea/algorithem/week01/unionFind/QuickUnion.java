package com.qizy.coursea.algorithem.week01.unionFind;

/**
 * 
 * @author qizy
 *
 */
public class QuickUnion {
	/*
	 * datastructure integer array id[i] is the parent of i end conditon
	 * loop:root,which num is root,of courser when id[i]==i
	 */

	private int[] sets;

	private int count;

	public QuickUnion(int size) {
		// init
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = i;
		}
		sets = a;
		count = size;
	}
	
	public boolean isconnected(int p,int q) {
		return root(p)==root(q);
		
	}

	private int root(int p) {
		while(sets[p]!=p) {
			p = sets[p];
		}
		return p;
	}
	
	public void union(int p,int q) {
		// change root of p to point to root of q
		int rp = root(p);
		int rq = root(q);
		sets[rp] = rq;
	}
	
	public int[] getSets() {
		return sets;
	}

	public void setSets(int[] sets) {
		this.sets = sets;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void print() {
		for (int i : sets) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
