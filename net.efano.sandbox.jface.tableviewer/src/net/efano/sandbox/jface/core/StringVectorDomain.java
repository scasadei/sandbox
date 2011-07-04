package net.efano.sandbox.jface.core;

import java.util.Vector;
import java.util.List;




public class StringVectorDomain extends Domain implements Framed,Symbolic,elementsByInt,DomainByInt  {

	private Vector<StringSWT> down;
	private Frame up;

	


	public StringVectorDomain() {
		down = new Vector<StringSWT>();
	}

	public void init() {
		rootAttributes = new StringVectorDomain();
	}
	@Override
	public Vector<StringSWT> symbolic() {
		return down;
	}

	@Override
	public Frame context() {
		return up;
	}

	public Frame getUp() {
		return up;
	}
	
	
	public List<StringSWT> getDown() {
		return down;
	}

	public boolean add(String elem) {
		return down.add(new StringSWT(elem));
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
