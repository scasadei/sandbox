package net.efano.sandbox.core;

import net.efano.sandbox.core.jface.StringVectorDomainSWT;


public class Domain  implements Framed,Symbolic {

	Frame context;
	Symbolic generator;
	StringVectorDomainSWT rootAttributes;
	
	public Domain (Frame aFrame, Symbolic aSymbolic) {
		context = aFrame;
		generator = aSymbolic;
	}
	
	public void init() {
		rootAttributes = new StringVectorDomainSWT();
	}

	public Domain() {
	}
	
	public void addRootAttribute(String elem) {
		rootAttributes.add(elem);
	}
	public Frame context() {
		return context;
	}
	
	public Object symbolic() {
		return generator.symbolic();
	}
	
	public Object definition() {
		return symbolic();
	}

}
