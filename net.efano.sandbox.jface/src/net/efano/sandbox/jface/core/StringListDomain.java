package net.efano.sandbox.jface.core;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class StringListDomain implements Framed,Symbolic{

	private Frame up;
	private LinkedList<String> down;
	
	public StringListDomain() {
		down = new LinkedList<String>();
	}
	
	@Override
	public List<String> symbolic() {
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
		return down.add(elem);
	}
	
}
