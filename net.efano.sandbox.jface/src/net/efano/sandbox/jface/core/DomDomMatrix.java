package net.efano.sandbox.jface.core;

import java.util.Vector;


public class DomDomMatrix implements valuesByIntInt {

	private DomainByInt rowDomain;
	private DomainByInt colDomain;
	Vector<Object []> data;
	private int numCols;
	
	public DomDomMatrix(int numCols)
	{
		this.numCols = numCols;
		data = new Vector<Object []>();
	}
	
	@Override
	public Object getValue(int row, int col) {
		return data.elementAt(row)[col];
	}
	
	public Object[] getTriple(int row,int col)
	{
		Object[] out = new Object[3];
		out[1] = rowDomain.getElement(row);
		out[2] = colDomain.getElement(col);
		out[3] = getValue(row,col);
		return out;
	}

	public void add(Object [] row)
	{
		assert(row.length==numCols);
		data.add(row);
	}
}
