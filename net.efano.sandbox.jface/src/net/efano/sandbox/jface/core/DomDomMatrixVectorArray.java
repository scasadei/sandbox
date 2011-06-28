package net.efano.sandbox.jface.core;

import java.util.Vector;


public class DomDomMatrixVectorArray implements valuesByIntInt {

	private DomainByInt rowDomain;
	private DomainByInt colDomain;
	Object [][] data;
	public int numCols() {
		return colDomain.numel();
	}
	public int numRows() {
		return rowDomain.numel();
	}
	
	public DomDomMatrixVectorArray(DomainByInt aRowDomain,
			DomainByInt aColDomain)
	{
		rowDomain = aRowDomain;
		colDomain = aColDomain;
		data = new Object [numRows()][numCols()];
	}
	
	@Override
	public Object getValue(int row, int col) {
		return data[row][col];
	}
	
	public Object[] getTriple(int row,int col)
	{
		Object[] out = new Object[3];
		out[1] = rowDomain.getElement(row);
		out[2] = colDomain.getElement(col);
		out[3] = getValue(row,col);
		return out;
	}

	public void setValue(int row,int col,Object val)
	{
		data[row][col] = val;
	}
}
