package net.efano.sandbox.jface.core;

import java.util.LinkedList;
import java.util.List;


import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;


public class StringListDomainSWT implements Framed,Symbolic {

	private LinkedList<StringSWT> down;
	private Frame up;

	
	// The GUI view
	static class View {
		private StringListDomainSWT viewModel;
		private Table committers;

		public View(StringListDomainSWT viewModel) {
			this.viewModel = viewModel;
		}

		public Shell createShell() {
			
			// Build a UI
			Display display = Display.getDefault();
			Shell shell = new Shell(display);
			shell.setLayout(new FillLayout());
			committers = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
			committers.setLinesVisible(true);
			TableColumn column = new TableColumn(committers, SWT.NONE);

			// Set up data binding.
			TableViewer peopleViewer = new TableViewer(committers);
			
			ViewerSupport.bind(peopleViewer, new WritableList(viewModel
					.getDown(), StringSWT.class), BeanProperties.value(
					StringSWT.class, "content"));

			column.pack();

			// Open and return the Shell
			shell.setSize(100, 300);
			shell.open();
			return shell;
		}
		
	}
	
	public StringListDomainSWT() {
		down = new LinkedList<StringSWT>();
		add("Pinco Pallino");
		add("stronzetto stronzini");
	}
	
	@Override
	public List<StringSWT> symbolic() {
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
	
	public Shell createShell() {
		
		// Build a UI
		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());
		Table committers = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		committers.setLinesVisible(true);
		TableColumn column = new TableColumn(committers, SWT.NONE);

		// Set up data binding.
		TableViewer peopleViewer = new TableViewer(committers);
		
		ViewerSupport.bind(peopleViewer, new WritableList(this
				.getDown(), StringSWT.class), BeanProperties.value(
				StringSWT.class, "content"));

		column.pack();

		// Open and return the Shell
		shell.setSize(100, 300);
		shell.open();
		return shell;
	}
	
}
