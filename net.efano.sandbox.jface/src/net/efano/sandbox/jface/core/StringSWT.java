package net.efano.sandbox.jface.core;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.eclipse.core.databinding.observable.value.AbstractObservableValue;

public class StringSWT extends AbstractObservableValue {

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		changeSupport.firePropertyChange("lastName", this.content,
				this.content = content);
		this.content = content;
	}

	StringSWT(String aString) {
		content = aString;
	}

	private PropertyChangeSupport changeSupport = new PropertyChangeSupport(
			this);
	String content;
	
	public void addPropertyChangeListener(String propertyName,
			PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(listener);
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(String propertyName,
			PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(propertyName,
				listener);
	}

	protected void firePropertyChange(String propertyName, Object oldValue,
			Object newValue) {
		changeSupport.firePropertyChange(propertyName, oldValue,
				newValue);
	}
	
	// Required to implement AbstractObservableValue
	
	@Override
	public Object getValueType() {
		return StringSWT.class;
	}

	@Override
	protected Object doGetValue() {
		return getContent();
	}

}
