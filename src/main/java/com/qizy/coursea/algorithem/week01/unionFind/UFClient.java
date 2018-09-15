package com.qizy.coursea.algorithem.week01.unionFind;

public class UFClient {

	public static void main(String[] args) {
		QuickFind QF = new QuickFind(10);
		
		QF.union(3, 5);
		QF.print();
		QF.union(6, 9);
		QF.union(1, 3);
		QF.print();
		
		QuickUnion qu = new QuickUnion(10);
		qu.union(3, 2);
		qu.print();
		qu.union(4, 2);
		qu.print();
		qu.union(2, 9);
		
		qu.print();
	}

}
