package net.efano.sandbox.jface.core;

import java.util.Vector;
import java.util.List;




public class StringVectorDomain extends Domain implements Framed,Symbolic,elementsByInt,DomainByInt  {

	private Vector<String> down;
	private Frame up;

	


	public StringVectorDomain() {
		down = new Vector<String>();
	}

	public void init() {
		rootAttributes = new StringVectorDomain();
	}
	@Override
	public Vector<String> symbolic() {
		return down;
	}

	@Override
	public Frame context() {
		return up;
	}

	public Frame getUp() {
		return up;
	}
	
	
	public List<String> getDown() {
		return down;
	}

	public boolean add(String elem) {
		return down.add(new String(elem));
	}
	

	@Override
	public Object getElement(int id) {
		return down.get(id);
	}


	@Override
	public int numel() {
		return down.size();
	}
	
}
