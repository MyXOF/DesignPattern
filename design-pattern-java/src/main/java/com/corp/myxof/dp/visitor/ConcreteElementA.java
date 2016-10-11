package com.corp.myxof.dp.visitor;

public class ConcreteElementA extends Element{

	@Override
	public void Accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

	@Override
	public String toString(){
		return "ConcreteElementA";
	}
	
}
