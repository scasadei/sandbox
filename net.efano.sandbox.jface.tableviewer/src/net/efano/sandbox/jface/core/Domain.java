package net.efano.sandbox.jface.core;


public class Domain  implements Framed,Symbolic {

	Frame context;
	Symbolic generator;
	StringVectorDomain rootAttributes;
	
	public Domain (Frame aFrame, Symbolic aSymbolic) {
		context = aFrame;
		generator = aSymbolic;
	}
	
	Domain() {
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