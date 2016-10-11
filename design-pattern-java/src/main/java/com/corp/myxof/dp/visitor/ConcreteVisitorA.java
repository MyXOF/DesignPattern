package com.corp.myxof.dp.visitor;

public class ConcreteVisitorA extends Visitor{

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println("visitA "+concreteElementA.toString());
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println("visitA "+concreteElementB.toString());
	}
}
