package net.efano.sandbox.jface.core;

public class FramedString extends StringSymbolic implements FramedSymbolic {

	Frame context;
	FramedString(String aString,Frame aFrame) {
		super(aString);
		context = aFrame;
	}

	public Frame context() {
		return context;
	}
	
}
