package com.qizy.coursea.algorithem.week01.unionFind;
/**
 * 
 * @author qizy
 *
 */
public class QuickFind {

	private int[] sets;
	
	private int count;
	/*
	 * find和union针对的都是集合，也就是一组不重复的元素。
	 * 最简单的代表一个集合就是每组元素都给予一个特定的标记，
	 * 如果标记相同，则代表他们是属于相同的集合的，
	 * 如果标记不同，可以把其中一个标记改成对方的标记，
	 * 这样就是简单的union操作
	 */
	public QuickFind(int size) {
		//init
		int [] a = new int[size];
		for(int i=0;i<size;i++) {
			a[i]=i;
		}
		sets = a;
		count =size;
	}
	
	public int find(int i) {
		return sets[i];
	}
	public void union(int p,int q) {
		
	}
	public boolean Connected(int p,int q) {
		
		return find(p)==find(q);
		
	}
}
