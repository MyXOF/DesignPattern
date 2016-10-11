package com.corp.myxof.dp.visitor;

public class ConcreteVisitorB extends Visitor{

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println("visitB "+concreteElementA.toString());
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println("visitB "+concreteElementB.toString());
	}
}
