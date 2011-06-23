package net.efano.sandbox.jface.core;

import java.util.Collection;
import java.util.Vector;

public class StringVectorDomain implements CollectionDomain<String>,Framed,Symbolic,Collection<String> {

	private Frame context;
	private Vector<String> data;
	@Override
	public Object symbolic() {
		return data;
	}

	@Override
	public Frame context() {
		return context;
	}

	public boolean add(String elem) {
		return data.add(elem);
	}
	
}
