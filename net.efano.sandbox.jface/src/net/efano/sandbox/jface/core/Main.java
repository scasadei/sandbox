package net.efano.sandbox.jface.core;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Display display = Display.getDefault();

		// In an RCP application, the threading Realm will be set for you
		// automatically by the Workbench. In an SWT application, you can do
		// this once, wrapping your binding method call.
		Realm.runWithDefault(SWTObservables.getRealm(display), new Runnable() {
			@Override
			public void run() {

				StringVectorDomainSWT viewModel = new StringVectorDomainSWT();
				viewModel.init();
				viewModel.add("Pinco Pallino");
				viewModel.add("stronzetto stronzini");
				Shell shell = new StringVectorDomainSWT.View(viewModel).createShell();

				// The SWT event loop
				while (!shell.isDisposed()) {
					if (!display.readAndDispatch()) {
						display.sleep();
					}
				}
			}
		});
	}
	

}
