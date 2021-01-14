package tools.vitruv.domains.java.monitorededitor.changeclassification.events;

import org.eclipse.jdt.core.dom.FieldDeclaration;

import tools.vitruv.domains.java.monitorededitor.changeclassification.ChangeEventVisitor;

public class ChangeFieldModifiersEvent extends ChangeFieldEvent {

	public ChangeFieldModifiersEvent(FieldDeclaration original, FieldDeclaration changed, int line) {
		super(original, changed, line);
	}

	@Override
	public String toString() {
		return "ChangeFieldModifiersEvent [original=" + this.original.toString().replace(";\n", "") + ", changed="
				+ this.changed.toString().replace(";\n", "") + ", line=" + this.line + "]";
	}

	@Override
	public <T> T accept(final ChangeEventVisitor<T> visitor) {
		return visitor.visit(this);
	}

}
